package com.bridgelabs.utility;

public class HashingFunction<K, V> {
	class Node<K, V> {
		K key;
		V value;
		Node<K, V> next;

		public Node(K key, V value, Node<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	Node<K, V>[] table;
	int capacity = 11;

	public HashingFunction() {
		table = new Node[capacity];
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(K newKey, V data) {
		if (newKey == null)
			return;

		int hash = hash(newKey);
		Node<K, V> newNode = new Node<K, V>(newKey, data, null);

		if (table[hash] == null)
			table[hash] = newNode;
		else {
			Node<K, V> previous = null;
			Node<K, V> current = table[hash];

			while (current != null) {
				if (current.key.equals(newKey)) {
					if (previous == null) {
						newNode.next = current.next;
						return;

					} else {
						newNode.next = current.next;
						previous.next = newNode;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newNode;
		}
	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Node<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key))
					return temp.value;
				temp = temp.next; // return value corresponding to key.
			}
			return null; // returns null if key is not found.
		}
	}

	public boolean remove(K deleteKey) {

		int hash = hash(deleteKey);

		if (table[hash] == null) {
			return false;
		} else {
			Node<K, V> previous = null;
			Node<K, V> current = table[hash];

			while (current != null) { // we have reached last entry node of bucket.
				if (current.key.equals(deleteKey)) {
					if (previous == null) { // delete first entry node.
						table[hash] = table[hash].next;
						return true;
					} else {
						previous.next = current.next;
						return true;
					}
				}
				previous = current;
				current = current.next;
			}
			return false;
		}
	}

	public void display() {
		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Node<K, V> entry = table[i];
				while (entry != null) {
					System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
					entry = entry.next;
				}
			}
		}
	}
}

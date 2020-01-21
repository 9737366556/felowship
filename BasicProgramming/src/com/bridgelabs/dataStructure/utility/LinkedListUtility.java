package com.bridgelabs.dataStructure.utility;

import java.io.IOException;
import java.io.PrintWriter;

public class LinkedListUtility<E> {

	class Node<E> {
		E data;
		Node<E> next;
	}

	Node head;

	public <E> void insert(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public <E> void insertAtStart(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;
		node.next = head;

		head = node;
	}

	public <E> void insertAt(int index, E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;

		Node<E> n = head;
		if (index == 0) {
			insertAtStart(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public <E> void deletFirst() {
		head = head.next;
	}

	public <E> void deletAt(int index) {
		if (index == 0) {
			deletFirst();
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}

	public <E> void show() {
		Node<E> node = head;
		System.out.print("[");
		while (node.next != null) {
			System.out.print(node.data + ",");
			node = node.next;
		}
		System.out.println(node.data + "]");
	}

	public <E> boolean search(E data) {
		Node<E> node = head;
		while (node.next != null) {
			if (node.data.equals(data)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	public <E> int searchIndex(E data) {
		Node<E> node = head;
		int count = 0;
		while (node.next != null) {
			if (node.data.equals(data)) {
				count++;
			}
			node = node.next;
		}
		return count;
	}

	public <E> void printIntoFile(String path) {
		try {

			Node node = head;
			PrintWriter writer = new PrintWriter(path);
			while (node.next != null) {
				writer.print(node.data);
				writer.print(" ");
				
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
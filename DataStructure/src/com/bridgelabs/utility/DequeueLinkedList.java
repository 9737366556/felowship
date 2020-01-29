package com.bridgelabs.utility;



/**
 * Purpose : To store data into dequeue so easily get and manupulate the data according to user requirement
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class DequeueLinkedList {

	class Node<E> {
		E data;
		Node next;
	}

	Node head;
	int size;

	public <E> void insertLast(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node; // if node is first object that its a head of the list
		} else {
			Node n = head; // now n = head(first)
			while (n.next != null) { // changing nood to last position
				n = n.next; // change node to next node
			}
			n.next = node; // at last position assing node
		}

	}

	public <E> Object removeFirst() {
		Object data;
		if (!isEmpty()) {
			data = head.data;
			head = head.next;
			return data;
		}
		return null;
	}

	public <E> Object removeLast() {

		Node node = head;
		Node n = null;
		E comparable = null;
		if (node.next == null) {
			removeFirst();
		} else {
			while (node.next.next != null) {
				node = node.next;
			}
			comparable = (E) node.next.data;
			n = node.next;
			node.next = n.next;
		}
		return comparable;
	}

	public <E> void show() {
		Node<E> node = head;
		System.out.print("["); // Starting list from '[' Parentheses
		if (node != null) {
			while (node.next != null) {
				System.out.print(node.data + ",");
				node = node.next;
			}
			if (node.data != null)
				System.out.print(node.data); // list ending with ']' Parentheses
		}
		System.out.println("]");
	}

	public <E> E first() {
		E data = null;
		if (head != null)
			data = (E) head.data;
		return data;
	}

	public <E> E last() {
		Node node = head;
		E data = null;

		while (node.next != null) {
			node = node.next;
		}
		data = (E) node.data;
		return data;
	}

	public <E> int size() {
		Node node = head;
		int size = 1;
		while (node.next != null) {
			size++;
			node = node.next;
		}
		return size;
	}

	public <E> Boolean isEmpty() {
		Node node = head;
		if (node == null)
			return true;
		return false;
	}

	
}

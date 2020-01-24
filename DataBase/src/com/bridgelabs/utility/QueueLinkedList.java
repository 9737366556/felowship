package com.bridgelabs.utility;

public class QueueLinkedList<E> {

	class Node<E> {
		E data;
		Node next;
	}

	Node first;
	Node last;
	int size;

	public <E> Node getNewNode(E data) {
		Node a = new Node();
		a.data = data;
		a.next = null;
		return a;
	}

	public <E> void inserst(E data) {
		if (last == null) {
			first = last = getNewNode(data);
			size++;
			return;
		}
		size++;
		last.next = getNewNode(data);
		last = last.next;
	}
	
	public <E> Object removeFirst() {
		if(isEmpty() != true) {
			size--;
			E data = (E) first.data;
			first = first.next;
			if(first == null)
				last = null;
			return data;
		}
		return null;
	}

	public <E> void show() {
		Node<E> node = first;
		System.out.print("["); // Starting list from '[' Parentheses
		while (node.next != null) {
			System.out.print(node.data + ",");
			node = node.next;
		}
		System.out.println(node.data + "]"); // list ending with ']' Parentheses

	}
	
	public <E> Object first() {
		if(first != null)
			return first.data;
		return null;
	}
	
	public <E> Object last() {
		if(last != null)
			return last.data;
		return null;
	}

	public <E> int size() {
		return size;
	}
	
	public <E> Boolean isEmpty() {
		if(last == null)
			return true;
		return false;
	}

}
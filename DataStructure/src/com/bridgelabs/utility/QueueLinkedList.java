package com.bridgelabs.utility;



/**
 * Purpose : To enter the data into queue using linked list
 * 			for fifo type transaction 
 * 
 * 
 * @author Nikunj Balar
 *
 * @param <E>
 */
public class QueueLinkedList<E> {

	class Node<E> {
		E data;
		Node next;
	}

	Node first;
	Node last;
	int size;

	// function for enter object into list
	// return node object
	public <E> Node getNewNode(E data) {
		Node a = new Node();
		a.data = data;
		a.next = null;
		return a;
	}

	// function to enter object into queue 
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
	
	// function to remove first queue object
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

	//function to show queue
	public <E> void show() {
		Node<E> node = first;
		System.out.print("["); // Starting list from '[' Parentheses
		while (node.next != null) {
			System.out.print(node.data + ",");
			node = node.next;
		}
		System.out.println(node.data + "]"); // list ending with ']' Parentheses

	}
	
	// return first object
	public <E> Object first() {
		if(first != null)
			return first.data;
		return null;
	}
	
	//return last queue object 
	public <E> Object last() {
		if(last != null)
			return last.data;
		return null;
	}

	//return size of the queue
	public <E> int size() {
		return size;
	}
	
	// function to check queue is empty or not
	//return true if not empty else return false
	public <E> Boolean isEmpty() {
		if(last == null)
			return true;
		return false;
	}

}
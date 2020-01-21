package com.bridgelabs.dataStructure.utility;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Purpose: To reused code
 * 
 * 
 * @author Nikunj Balar
 * @param <E>
 * 
 */
public class LinkedListUtility<E> {

	// node object
	class Node<E> {
		E data; // devloper decided object data
		Node<E> next; // referance of next object
	}

	Node head; // creating starting object as head

	// function to insert data into object
	public <E> void insert(E data) {
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

	// function to add node at first position
	public <E> void insertAtStart(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;
		node.next = head;

		head = node; // change the head node
	}

	// function to add at perticular position
	public <E> void insertAt(int index, E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;

		Node<E> n = head;
		if (index == 0) { // for first position reused function
			insertAtStart(data);
		} else { // for the position of the index-1
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	// function for delet first objct
	public <E> void deletFirst() {
		head = head.next; // change the head to the next object
	}

	// function for delet objct on the base of index
	public <E> void deletAt(int index) {
		if (index == 0) {
			deletFirst(); // delet object at first position
		} else {
			Node n = head;
			Node n1 = null;
			// for go to the index-1 position
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next; // changing null to the n.next object
			n.next = n1.next; // refering next object after deleted object
		}
	}

	// function to show all the object of the list
	public <E> void show() {
		Node<E> node = head;
		System.out.print("["); // Starting list from '[' Parentheses
		while (node.next != null) {
			System.out.print(node.data + ",");
			node = node.next;
		}
		System.out.println(node.data + "]"); // list ending with ']' Parentheses
	}

	// functin to search an object from list
	// return boolesan value
	public <E> boolean search(E data) {
		Node<E> node = head;
		while (node.next != null) {
			if (node.data.equals(data)) { // currunt object and the search object both are euale
				return true; // return true
			}
			node = node.next;
		}
		if (node.data.equals(data)) {
			return true;
		}

		return false;
	}

	// function to search an object from list
	// return the position of the index
	public <E> int searchIndex(E data) {
		Node<E> node = head;
		int count = 0;
		int index = 0;
		boolean find = false;
		while (node.next != null) {
			if (node.data.equals(data)) {
				find = true;
				index = count;
			}
			count++;
			node = node.next;
		}
		if (node.data.equals(data)) {
			find = true;
			index = count;
		}
		return index;
	}

	// function to print into external file
	public <E> void printIntoFile(String path) {
		try {
			Node node = head;
			PrintWriter writer = new PrintWriter(path);
			while (node.next != null) {
				writer.print(node.data);
				writer.print(" ");
				node = node.next;
			}
			writer.print(node.data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// function to delet last object and return that object
	public <E> E pop() {
		Node node = head;
		Node n = null;
		while (node.next.next != null) {
			node = node.next;
		}
		E comparable = (E) node.next.data;
		System.out.println(comparable);
		n = node.next;
		node.next = n.next;

		return comparable;
	}

	// function to delet index objet and return that object
	public <E> E pop(int index) {
		E comparable = null;
		if (index == 0) {
			comparable = (E) head.data;
			head = head.next;

		} else {
			Node node = head;
			Node n = null;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			comparable = (E) node.next.data;
			n = node.next;
			node.next = n.next;
		}
		System.out.println(comparable);
		return comparable;
	}
}
package com.bridgelabs.utility;

/**
 * Purpose : To store data into LIFO Structure
 * 			LIFO= Last In First Out
 * 
 * 
 * @author Nikunj Balar
 *
 * @param <T>
 */
public class StackUtility<T> {

	int i = 0;
	int capacity = 5;
	Comparable<T>[] array = new Comparable[capacity];

	// function to push or insert data into stack
	public <E> void push(E data) {

		if (i == capacity)
			expand();

		array[i] = (Comparable) data;
		i++;
	}
	
	// for expand size of array
	private <E> void expand() {
		capacity *= 2;
		Comparable<T>[] arr = new Comparable[capacity];
		System.arraycopy(array, 0, arr, 0, size());
		array = arr;

	}

	// for remove last stack object
	//return last object
	public <E> Comparable<T> pop() {
		Comparable data = null;
		if (isEmpty() != true) {
			i--;
			data= array[i];
			array[i] = null;
			reduse();
		}
		return data;
	}

	// for decrease the size of array
	private <E> void reduse() {
		if (size() <= capacity / 2)
			capacity /= 2;
		Comparable<T>[] arr = new Comparable[capacity];
		System.arraycopy(array, 0, arr, 0, size());
		array = arr;
	}

	//for get last stack object
	//return last object
	public <E> Comparable<T> peek() {
		Comparable data = array[i - 1];
		return data;

	}

	// for printing stack
	public <E> void show() {
		System.out.print("[ ");
		for (Comparable n : array) {
			if (n != null)
				System.out.print(n + " ");
		}
		System.out.println("]");
	}

	// for find size of stack
	//return size int
	public <E> int size() {
		return i;
	}

	// for find capacity of stack
	// return int capacity
	public <E> int capacity() {
		return capacity;
	}

	// to check stack is empty or not
	public <E> boolean isEmpty() {
		if (i == 0)
			return true;
		return false;
	}
}
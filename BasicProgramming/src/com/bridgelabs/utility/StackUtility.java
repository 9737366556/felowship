package com.bridgelabs.utility;

public class StackUtility<T> {

	int i = 0;
	int capacity = 5;
	Comparable<T>[] array = new Comparable[capacity];

	public <E> void push(E data) {

		if (i == capacity)
			expand();

		array[i] = (Comparable) data;
		i++;
	}

	private <E> void expand() {
		capacity *= 2;
		Comparable<T>[] arr = new Comparable[capacity];
		System.arraycopy(array, 0, arr, 0, size());
		array = arr;

	}

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

	private <E> void reduse() {
		if (size() <= capacity / 2)
			capacity /= 2;
		Comparable<T>[] arr = new Comparable[capacity];
		System.arraycopy(array, 0, arr, 0, size());
		array = arr;
	}

	public <E> Comparable<T> peek() {
		Comparable data = array[i - 1];
		return data;

	}

	public <E> void show() {
		System.out.print("[ ");
		for (Comparable n : array) {
			if (n != null)
				System.out.print(n + " ");
		}
		System.out.println("]");
	}

	public <E> int size() {
		return i;
	}

	public <E> int capacity() {
		return capacity;
	}

	public <E> boolean isEmpty() {
		if (i == 0)
			return true;
		return false;
	}
}

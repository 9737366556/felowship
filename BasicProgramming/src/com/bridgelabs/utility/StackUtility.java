package com.bridgelabs.utility;

public class StackUtility<T> {

	int i=10;
	Comparable<T> []array=new Comparable[2];
	
	public <E> void push(E data) {
		array[i]=(Comparable) data;
		i++;
	}
}

package com.bridgelabs.collection.list;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(5646);
		stack.push(54);
		stack.push(78);
		System.out.println("Added element" + stack);
		stack.remove(2);
		System.out.println("After removing element at 3 position" + stack);
		System.out.println("Object at 3 position : " + stack.get(3));
		System.out.println("object present or not : " + stack.equals(stack));
		
		System.out.println("get class name using object : "+stack.getClass());
		System.out.println("adding collection type object");
		Stack<Integer> l = new Stack<Integer>();
		l.push(2);
		l.push(1);
		l.push(5);
		l.push(4);
		l.push(3);
		stack.addAll(0, l);

		System.out.println("printing data using ListIterator");
		ListIterator li = stack.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next() + ", ");
		}
		System.out.println();
		stack.removeAll(l);
		System.out.println("After removing all element of collection object : " + stack);
		
		stack.clear();
		System.out.println("After clearing the object : " + stack);

	}
}

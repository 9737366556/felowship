package com.bridgelabs.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("N");
		list.add("i");
		list.add("k");
		list.add("u");
		list.add("n");
		list.add("j");
		System.out.println("Added element"+list);
		list.remove("k");
		System.out.println("After removing element "+list);
		list.add(2, "k");
		System.out.println("After adding element at 2 position "+list);
		System.out.println(list.get(3));
		
	}
}

package com.bridgelabs.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Character> list=new LinkedList<Character>();
		list.add('N');
		list.add('i');
		list.add('k');
		list.add('u');
		list.add('n');
		list.add('j');
		System.out.println("Added element" + list);
		list.remove(2);
		System.out.println("After removing element at 3 position" + list);
		list.add(2, 'k');
		System.out.println("After adding element at 3 position " + list);
		System.out.println("list object at 3 position : " + list.get(3));
		System.out.println("object present in list or not : " + list.equals(list));
		
		System.out.println("get class name using object : "+list.getClass());
		System.out.println("adding collection type object into listS");
		ArrayList<Character> l = new ArrayList<Character>();
		l.add('2');
		l.add('1');
		l.add('5');
		l.add('4');
		l.add('3');
		list.addAll(0, l);

		System.out.println("printing data using ListIterator");
		ListIterator li = list.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next() + ", ");
		}
		System.out.println();
		list.removeAll(l);
		System.out.println("After removing all element of collection of object : " + list);
		
		list.clear();
		System.out.println("clearing the list object : " + list);

	}

}

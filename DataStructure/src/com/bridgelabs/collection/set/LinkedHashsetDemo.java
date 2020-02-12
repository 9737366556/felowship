 package com.bridgelabs.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("hi");
		set.add("hello");
		set.add("kem cho");
		set.add("majama");
		set.add("chalo gujrat");
		System.out.println("Showing all object " + set);
		set.remove("hi");
		System.out.println("after invoking removing(object)" + set);

		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("20");
		s.add("65");
		s.add("40");
		s.add("45");

		System.out.println("Adding one type of collection object");
		set.addAll(s);
		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

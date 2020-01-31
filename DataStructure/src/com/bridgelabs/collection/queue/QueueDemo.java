package com.bridgelabs.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("N");
		queue.add("i");
		queue.add("k");
		queue.add("u");
		queue.add("n");
		queue.add("j");
		System.out.println("Added element" + queue);
		queue.remove("k");
		System.out.println("After removing element " + queue);
		queue.add("k");
		System.out.println("poll the object "+queue.poll());
		System.out.println("After polling first element " + queue);
		System.out.println("object present or not : " + queue.equals(queue));
		
		System.out.println("get class name using object : "+queue.getClass());
		System.out.println("adding collection type object");
		PriorityQueue<String> l = new PriorityQueue<String>();
		l.add("2");
		l.add("1");
		l.add("15");
		l.add("14");
		l.add("13");
		queue.addAll(l);
		System.out.println("printing data using Iterator");
		Iterator li = queue.iterator();
		while (li.hasNext()) {
			System.out.print(li.next() + ", ");
		}
		System.out.println();
		queue.removeAll(l);
		System.out.println("After removing all element of collection object : " + queue);
		
		queue.clear();
		System.out.println("after clearing the object : " + queue);
		
	}
}

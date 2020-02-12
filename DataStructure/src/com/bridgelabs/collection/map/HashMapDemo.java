package com.bridgelabs.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "nikunj");
		map.put(2, "sahil");
		map.put(3, "prasad");
		map.put(4, "abhishek");

		System.out.println(map);
		System.out.println(map.get(4));
		System.out.println(map.size());

		System.out.println("iterating data using forEach loop");
		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		// traversing to map
		Set s = map.entrySet(); // converting map into set so we traverse it
		Iterator i = s.iterator();
		System.out.println("printing data using iterator ");
		while (i.hasNext()) {
			Map.Entry entry = (Entry) i.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
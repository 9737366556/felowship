package com.bridgelabs.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(2, 42);
		map.put(1, 35);
		map.put(3, 40);
		map.put(4, 6846);
		map.put(5, 0);

		System.out.println(map);
		System.out.println("printing first entry " + map.firstEntry());
		System.out.println("getting first key " + map.firstKey());
		System.out.println("getting first entry and delet that " + map.pollFirstEntry());

		System.out.println("Iterating data using forEach loop");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("iterating data using iterator");
		Set s = map.entrySet();
		Iterator e = s.iterator();
		while (e.hasNext()) {
			Map.Entry entry = (Entry) e.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
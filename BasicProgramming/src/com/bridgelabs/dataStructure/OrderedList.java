package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.LinkedListUtility;
import com.bridgelabs.utility.Utility;

public class OrderedList {
	public static void main(String[] args) {
		LinkedListUtility<Integer> list = new LinkedListUtility<Integer>();
		String str = Utility.fileRead("/home/bridgeit/Desktop/list.txt");
		String s[] = str.split(" ");
		String array[] = Utility.bubbleSort(s);
		for (int i = 0; i < array.length; i++) {
			list.insert(array[i]);
		}
		list.show();
		System.out.println("Enter number what you want to search");
		String data = Utility.stringInput();
		int index = list.searchIndex(data);
		if (index > 0) {
			list.deletAt(index);
		} else {
			list.insert(data);
		}
		list.show();
		list.printIntoFile("/home/bridgeit/Desktop/txt file/numbers.txt");
	}
}

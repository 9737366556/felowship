package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.LinkedListUtility;
import com.bridgelabs.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) {
		LinkedListUtility<String> list = new LinkedListUtility<String>();
		String sb = Utility.fileRead("/home/bridgeit/Desktop/list.txt");
		String[] words = Utility.splitS(' ', sb);
		for (int i = 0; i < words.length; i++) {
			list.insert(words[i]);
		}
		list.show();
		System.out.println("Enter input what you want to search");
		String data = Utility.stringInput();
		int index = list.searchIndex(data);
		if (index > 0) {
			list.deletAt(index);
		} else {
			list.insert(data);
		}

		list.show();
		list.printIntoFile("/home/bridgeit/Desktop/list.txt");

	}
}

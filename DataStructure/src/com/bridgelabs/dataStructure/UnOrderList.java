package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.LinkedListUtility;
import com.bridgelabs.utility.Utility;


/**
 * Purpose : To read the word from file and search the word if the word found than remove it and not than add it
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class UnOrderList {

	public static void main(String[] args) {
		LinkedListUtility<String> list = new LinkedListUtility<String>();
		// reading file
		String sb = Utility.fileRead("/home/bridgeit/Desktop/list.txt");
		// spliting it into
		String[] words = Utility.splitS(' ', sb);
		// adding each word into list
		for (int i = 0; i < words.length; i++) {
			list.insert(words[i]);
		}
		// disply list
		list.show();
		System.out.println("Enter input what you want to search");
		String data = Utility.stringInput();
		// search for word
		int index = list.searchIndex(data);
		// if word found than delet it
		if (index > 0)
			list.deletAt(index);
		// if word not found than delet it
		else
			list.insert(data);
		// disply updated list
		list.show();
		// update file with updated list
		list.printIntoFile("/home/bridgeit/Desktop/list.txt");
	}
}

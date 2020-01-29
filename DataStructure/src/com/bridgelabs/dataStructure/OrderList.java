package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.LinkedListUtility;
import com.bridgelabs.utility.Utility;


/**
 * Purpose : reading file and add it into list and serch the word is found than delet it else add it
 * 
 * @author Nikunj Balar
 *
 */
public class OrderList {

	public static void main(String[] args) {
		LinkedListUtility<String> list = new LinkedListUtility<String>();
		// reading txt file
		String str = Utility.fileRead("/home/bridgeit/Desktop/list.txt");
		// convert file into word array
		String s[] = str.split(" ");
		// sorting array using bubblesort function
		String array[] = Utility.bubbleSort(s);
		for (int i = 0; i < array.length; i++) {
			list.insert(array[i]);
		}
		// displaying all element of list
		list.show();
		System.out.println("Enter number what you want to search");
		String data = Utility.stringInput();
		int index = list.searchIndex(data);
		// if found than delet it
		if(index > 0)
			list.deletAt(index);
		// if not found than add it
		else
			list.insert(data);
		// displayinng final list
		list.show();
		// update file
		list.printIntoFile("/home/bridgeit/Desktop/list.txt");

	}

}

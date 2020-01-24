package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.LinkedListUtility;
import com.bridgelabs.utility.Utility;


/**
 * Purpose : To Enter element in order List using OrderList 
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class OrderedList {
	public static void main(String[] args) {
		LinkedListUtility<Integer> list = new LinkedListUtility<Integer>();
		// reading txt file
		String str = Utility.fileRead("/home/bridgeit/Desktop/list.txt");
		// convert file into word array
		String s[] = str.split(" ");
		// sorting array using bubblesort function
		String array[] = Utility.bubbleSort(s);
		// adding sorted array into list object
		for (int i = 0; i < array.length; i++) {
			list.insert(array[i]);
		}
		// displaying all element of list
		list.show();
		System.out.println("Enter number what you want to search");
		String data = Utility.stringInput();
		int index = list.searchIndex(data);
		// if found than delet it
		if (index > 0) {
			list.deletAt(index);
		// if not found than add it
		} else {
			list.insert(data);
		}
		// displayinng final list
		list.show();
		// update file 
		list.printIntoFile("/home/bridgeit/Desktop/txt file/numbers.txt");
	}
}

package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.DequeueLinkedList;
import com.bridgelabs.utility.Utility;



/**
 * Purpose : To check the String is pelindrom or not
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class PelindromChecker {
	public static void main(String[] args) {
		// DequeueLinkedList object
		DequeueLinkedList list = new DequeueLinkedList();
		System.out.println("Enter String line");
		// user input
		String line =Utility.stringInput();
		// convert into array
		char[]words = line.toCharArray();
		// insert array into DequeueLinkedList
		for (int i = 0; i < words.length; i++) {
			list.insertLast(words[i]);
		}
		// printing all the object of the DequeueLinkedList
		list.show();
		// method to check string is pelindrom
		DataStructureUtility.pelindrom(list);
		// if list is empty than String is pelindrom or not
		if (list.isEmpty() == true)
		System.out.println("String is pelindrom");
		else 
			System.out.println("String is not pelindrom");
	}
}
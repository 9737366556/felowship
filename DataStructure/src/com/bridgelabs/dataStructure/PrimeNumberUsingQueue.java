package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.QueueLinkedList;
import com.bridgelabs.utility.Utility;


/**
 * Purpose : To Store the numbers that are prime aswell as anagrame into QueueLinkedList
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class PrimeNumberUsingQueue {
	public static void main(String[] args) {
		try {
			System.out.println("Enter range for search");
			int n=Utility.integerInput();
			// function return list object of queueLinkedlist
			// function return objects of prime and and anagram
			QueueLinkedList<Integer> list=DataStructureUtility.anagramQueueLinkedList(n);
			// disply the list
			list.show();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

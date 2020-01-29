package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.StackUtility;
import com.bridgelabs.utility.Utility;

/**
 * Purpose : To Store the numbers that are prime aswell as anagrame into
 * StackLinkedList
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class PrimeAnagramStack {

	public static void main(String[] args) {
		try {
			System.out.println("Enter range of number");
			int n= Utility.integerInput();
			StackUtility<Integer> stack =DataStructureUtility.anagramStackLinkedList(n);
			System.out.println("Numbers that are anagram as well as pelindrom");
			stack.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

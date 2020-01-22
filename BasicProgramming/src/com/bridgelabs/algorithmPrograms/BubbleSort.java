package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.utility.Utility;

/**
 * Purpose: To sort a String using BubbleSort
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		try { //try catch for exception handling if exception is occured
			System.out.println("enter String line");
			String line = Utility.stringInput(); // function to read argument of standerd input
			String [] words=Utility.bubbleSort(line);
			for (int i = 0; i < words.length; i++) {
				System.out.print(words[i]+" ");
			}
		} catch (Exception e) {  
			System.out.println(e.getMessage());
		}
	}
}

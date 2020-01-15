package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

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
			Utility.bubbleSort(line);
		} catch (Exception e) {  
			System.out.println(e.getMessage());
		}
	}
}

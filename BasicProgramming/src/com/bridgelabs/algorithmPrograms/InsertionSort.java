package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: To sort a String using insertion sort
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		try {
			System.out.println("Enter String Line");
			String line = Utility.stringInput(); 
			Utility.insertionSort(line);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.logicalPrograms.utility.LogicalUtility;

/**
 * Purpose: To search a word from a given file and print the position of the
 * file
 * 
 * 
 * @author Nikunj Balar
 *
 */

public class BinarySearch {

	public static void main(String[] args) {
		try {
			String file = "/home/bridgeit/Desktop/list.txt"; // path of txt file
			LogicalUtility.fileReadBinarySearch(file);  // print the word if forund
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
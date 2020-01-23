package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.utility.Utility;


/**
 * Purpose: To find prime number in between given range
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class Primenumbers {
	public static void main(String[] args) {
		try {
			System.out.println("enter the last number you want to search");
			int n = Utility.integerInput();
			Utility.primeNumberRange(n); // print a all prime number beetween the range
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

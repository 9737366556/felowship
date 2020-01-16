package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: To find prime number in between given range
 * 
 * 
 * @author bridgeit
 *
 */
public class Primenumbers {
	public static void main(String[] args) {
		try {
			System.out.println("enter the last number you want to search");
			int n = Utility.integerInput();
			Utility.primeNumberRange(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

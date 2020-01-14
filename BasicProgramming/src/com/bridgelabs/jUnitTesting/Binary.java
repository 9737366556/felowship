package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To SwapNibbles and finding new number and to find the resultant
 * number is the number is a power of 2.
 * 
 * @author Nikunj Balar
 *
 */
public class Binary {
	public static void main(String[] args) {
		try {
			System.out.println("Emter decimal number");
			int n = Utility.integerInput();

			Utility.swapNibbles(n);
		} catch (Exception e) {
			System.err.println("you have an exception in main function of Binary " + e.getClass());
		}

		System.out.println("enter decimal number");
		System.out.println("main function of Binary class is ended");
	}
}

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
		System.out.println("Emter decimal number");
		int n = Utility.integerInput();

		Utility.swapNibbles(n);
	}
}

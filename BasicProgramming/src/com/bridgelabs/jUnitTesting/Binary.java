package com.bridgelabs.jUnitTesting;

import java.util.InputMismatchException;

import com.bridgelabs.utility.Utility;

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

			if(Utility.swapNibbles(n)) {
				System.out.println("New Number is a power of 2");
			}
			else {
				System.err.println("New Number is not a power of 2");
			}
		} catch (NumberFormatException | InputMismatchException e) {
			System.err.println("you have an exception in main function of Binary " + e.getClass());
		}
		System.out.println("main function of Binary class is ended");
	}
}

package com.bridgelabs.basicProgramming.basicProgram;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: For Prints the Nth harmonic number
 * 
 * @author Nikunj Balar
 *
 */
public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("enter number of harmonic number");
		int n = Utility.integerInput();// calling static integerInput() of Utility class for user input
		Utility.harmonicNumber(n);// calling static harmonicNumber() of Utility class for finding harmonic number
	}
}

package com.bridgelabs.basicProgramming;

import com.bridgelabs.utility.Utility;

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
		double num=Utility.harmonicNumber(n);// calling static harmonicNumber() of Utility class for finding harmonic number
		System.out.println(n+" harmonic number is "+num);
	}
}

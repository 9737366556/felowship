package com.bridgelabs.functionalPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: For Computes the prime factorization
 * 
 * @author Nikunj Balar
 *
 */
public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("main function of TwoDArray class will started");
		System.out.println("Enter number of raws");
		int m=Utility.integerInput();
		System.out.println("Enter number of column");
		int n=Utility.integerInput();
		
		Utility.twoDArray(m,n);
		System.out.println("main function of TwoDArray class will ended");

	}
}
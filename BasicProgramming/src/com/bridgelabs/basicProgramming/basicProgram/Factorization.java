package com.bridgelabs.basicProgramming.basicProgram;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: For  Computes the prime factorization
 * 
 * @author Nikunj Balar
 *
 */
public class Factorization {
	public static void main(String[] args) {
		System.out.println("Enter number which you want to find factorization");
		int n = Utility.integerInput();

		Utility.factorization(n); // print prime factore of input
	}
}

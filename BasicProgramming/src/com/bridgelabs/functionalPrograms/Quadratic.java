package com.bridgelabs.functionalPrograms;

import com.bridgelabs.utility.Utility;

/**
 * Purpose: To calculate Quadratic
 * 
 * @author Nikunj Balar
 *
 */
public class Quadratic {
	public static void main(String[] args) {
		System.out.println("main function of Quadratic class will start");
		System.out.println("Enter the value of a");
		int a = Utility.integerInput();
		System.out.println("Enter the value of b");
		int b = Utility.integerInput();
		System.out.println("Enter the value of c");
		int c = Utility.integerInput();
		if (a != 0) {
			Utility.quadraticEquation(a, b, c);
		} else {
			System.out.println("invalid ");
		}
		System.out.println("main function of Quadratic class will ended");
	}
}

package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To find a SqureRoot of number using NewtonMethod
 * 
 * @author Nikunj Balar
 *
 */
public class SqrtNewtonMethod {
	public static void main(String[] args) {
		try {
			// double c = Double.parseDouble(args[0]);

			double c = Utility.doubleInput();
			Utility.squreRoot(c);
		} catch (Exception e) {
			System.err.println("you have an exception in main function of SqrtNewtonMethod " + e.getClass());
		}
		System.out.println("enter valid input");
		System.out.println("main function of SqrtNewtonMethod class is ended");
	}
}
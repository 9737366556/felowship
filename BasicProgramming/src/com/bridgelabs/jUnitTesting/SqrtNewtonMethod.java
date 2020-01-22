package com.bridgelabs.jUnitTesting;

import java.util.InputMismatchException;

import com.bridgelabs.utility.Utility;

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
			System.out.println("Enter number"); 
			double c = Utility.doubleInput();
			System.out.println(Utility.squreRoot(c));
		} catch (NumberFormatException | InputMismatchException e) {
			System.err.println("you have an exception in main function of SqrtNewtonMethod " + e.getClass());
			System.out.println("enter valid input");
		}
		System.out.println("main function of SqrtNewtonMethod class is ended");
	}
}
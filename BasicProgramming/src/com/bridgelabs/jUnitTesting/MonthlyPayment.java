package com.bridgelabs.jUnitTesting;

import java.util.InputMismatchException;

import com.bridgelabs.utility.Utility;

/**
 * Purpose:To calculate Monthly payment
 * 
 * @author Nikunj Balar
 *
 */
public class MonthlyPayment {

	public static void main(String[] args) {
		try {
			System.out.println("Enter principal amount");
			double p = Utility.integerInput();
			System.out.println("Year of pay off");
			double y = Utility.integerInput();
			System.out.println("How much Percent Interest compounded monthly");
			double r = Utility.doubleInput();

			System.out.println("Total monthly payment is "+Utility.monthlyPayment(p, y, r));

		} catch (InputMismatchException e) {
			System.err.println("you have an exception in main function of MonthlyPayment " + e.getClass());
		}
		System.out.println("main function of MonthlyPayment class is ended");
	}
}

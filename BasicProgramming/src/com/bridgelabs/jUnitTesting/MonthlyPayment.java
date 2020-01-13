package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To calculate Monthly payment
 * 
 * @author Nikunj Balar
 *
 */
public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter principal amount");
		double p=Utility.integerInput();
		System.out.println("Year of pay off");
		double y=Utility.integerInput();
		System.out.println("How much Percent Interest compounded monthly");
		double r=Utility.doubleInput();
		
		Utility.monthlyPayment(p, y, r);
	}
}

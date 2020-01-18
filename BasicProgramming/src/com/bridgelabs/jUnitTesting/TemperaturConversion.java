package com.bridgelabs.jUnitTesting;

import java.util.InputMismatchException;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To convert Temperature from Fahrenheit to Celsius or from Celsius to
 * Fahrenheit
 * 
 * @author Nikunj Balar
 *
 */
public class TemperaturConversion {
	public static void main(String[] args) {
		try {
			System.out.println("Enter temperatur ");
			double temperatur = Utility.doubleInput();
			Utility.temperaturConversion(temperatur);
		} catch (InputMismatchException e) {
			System.err.println("you have an exception in TemperaturConversion " + e.getClass());
			System.out.println("enter temperature in number only");
		}
		System.out.println("main function of TemperaturConversion class is ended");
	}
}

package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To convert Temperature from Fahrenheit to Celsius or from Celsius to Fahrenheit
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class TemperaturConversion {
	public static void main(String[] args) {
		System.out.println("Enter temperatur ");
		double temperatur = Utility.doubleInput();
		Utility.temperaturConversion(temperatur);
	}
}

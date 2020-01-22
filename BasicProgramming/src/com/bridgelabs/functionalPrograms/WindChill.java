package com.bridgelabs.functionalPrograms;

import java.util.InputMismatchException;

import com.bridgelabs.utility.Utility;


/**
 * Purpose: To compute Wind Chill base on National Weather Service Definition
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class WindChill {
	public static void main(String[] args) {
		try {
			System.out.print("Enter temprature larger than 50 :");
			double t = Utility.doubleInput();
			System.out.print("Enter Speed between 3 and 120 :");
			double v = Utility.doubleInput();
			if (t > 50.00 && v < 120.00 && v > 3.0) {
				System.out.println("\n" + Utility.windChill(t, v)); // return boolean weather
			} else {
				System.out.println("enter valid details");
			}
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
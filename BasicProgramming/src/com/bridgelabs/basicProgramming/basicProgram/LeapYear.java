package com.bridgelabs.basicProgramming.basicProgram;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: For check the given year is leap year or not
 * 
 * @author Nikunj Balar
 *
 */
public class LeapYear {

	public static void main(String[] args) {

		System.out.println("enter year in yyyy formate");
		String str = Utility.stringInput();// taking input from user using stringInput() of Utility class
		if (str.length() == 4) {
			int year = Integer.parseInt(str);
			Utility.leapYear(year);// calling leapYear() from Utility class 
		}
		else {
			System.out.println("enter year in valid formate. valid formate is yyyy");
		}
	}
}

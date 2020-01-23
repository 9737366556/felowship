package com.bridgelabs.basicProgramming;

import com.bridgelabs.utility.Utility;

/**
 * Purpose: For check the given year is leap year or not
 * 
 * @author Nikunj Balar
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		boolean leap = false;
		System.out.println("enter year in yyyy formate");
		String str = Utility.stringInput();// taking input from user using stringInput() of Utility class
		if (str.length() == 4) {
			int year = Integer.parseInt(str);
			leap=Utility.leapYear(year);// calling leapYear() from Utility class
			if (leap) {
				System.out.println(str +" is leap year");
			}else {
				System.out.println(str +" is not leap year");
			}
		} else {
			System.out.println("enter year in valid formate. valid formate is yyyy");
		}
		
	}
}

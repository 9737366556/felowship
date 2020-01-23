package com.bridgelabs.jUnitTesting;

import java.util.InputMismatchException;

import com.bridgelabs.utility.LogicalUtility;
import com.bridgelabs.utility.Utility;

/**
 * Purpose:To find the day of week on the basis of given date
 * 
 * @author Nikunj Balar
 *
 */
public class DayOfWeek {

	public static void main(String[] args) {
		try {
			System.out.println("Enter year of the date in yyyy formate");
			short y = Utility.shortInput();
			System.out.println("Enter month of the date in mm formate");
			short m = Utility.shortInput();
			System.out.println("Enter date of the date in dd formate");
			short d = Utility.shortInput();

			int day = LogicalUtility.dayOfWeek(d, m, y);
			switch (day) {
			case 0:
				System.out.println("sunday");
				break;
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tuseday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("thursday");
				break;
			case 5:
				System.out.println("friday");
				break;
			case 6:
				System.out.println("saturday");
				break;
			default:
				break;
			}

		} catch (InputMismatchException  e) {
			System.err.println("you have an exception in main function of DayOfWeek " + e.getClass());
		}
		System.out.println("main function of DayOfWeek class is ended");

	}
}

package com.bridgelabs.jUnitTesting;

import com.bridgelabs.utility.Utility;

/**
 * Purpose:To find a binary representaion of decimal number
 * 
 * @author Nikunj Balar
 *
 */
public class ToBinary {
	public static void main(String[] args) {
		try {
			System.out.println("Enter decimal number");
			int num = Utility.integerInput();
			Utility.toBinary(num);
		} catch (Exception e) {
			System.err.println("you have an exception in main function of ToBinary " + e.getClass());
		}
		System.out.println("main function of ToBinary class is ended");
	}
}

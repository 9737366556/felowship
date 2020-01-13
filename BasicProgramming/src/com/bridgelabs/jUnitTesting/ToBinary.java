package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To find a binary representaion of decimal number
 * 
 * @author Nikunj Balar
 *
 */
public class ToBinary {
	public static void main(String[] args) {
		System.out.println("Enter decimal number");
		int num = Utility.integerInput();
		Utility.toBinary(num);
	}
}

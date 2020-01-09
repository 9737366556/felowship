package com.bridgelabs.basicProgramming.basicProgram;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: For prints a table of the powers of 2
 * 
 * @author Nikunj Balar
 *
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter base number");
		int base=Utility.integerInput();// taking input from user using integerInput() of Utility class
		System.out.println("Enter the power of the base lesser than 31");
		int n=Utility.integerInput();//taking input from user using integerInput() of Utility class
	
		Utility.powerOfNumber(n , base);// calling powerOfTwo() from Utility class 
	}
}

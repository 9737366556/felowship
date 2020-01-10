package com.bridgelabs.functionalPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: To Count the number of Distinct Triplets which sum equals to zero
 * 
 * @author Nikunj Balar
 *
 */
public class SumThreeIntEqualsZero {

	public static void main(String[] args) {
		System.out.println("main function of SumThreeIntEqualsZero class will start");
		System.out.println("enter the length of array");
		int n=Utility.integerInput();
		
		Utility.sumOfThreeEZero(n);
		System.out.printf("format", args);
		System.out.println("main function of SumThreeIntEqualsZero class will ended");
	}
}

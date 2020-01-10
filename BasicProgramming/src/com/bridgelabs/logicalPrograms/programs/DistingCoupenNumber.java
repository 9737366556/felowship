package com.bridgelabs.logicalPrograms.programs;

import com.bridgelabs.basicProgramming.utility.Utility;
import com.bridgelabs.logicalPrograms.utility.LogicalUtility;


/**
 * Purpose: Generate N number of Disting Coupen
 * 
 * @author Nikunj Balar
 *
 */
public class DistingCoupenNumber {
	public static void main(String[] args) {
		System.out.println("main function of DistingCoupenNumber class will started");
		System.out.println("how many disting number you want");
		int n = Utility.integerInput();  // calling integerInput function of Utility for reading standered input
		
		LogicalUtility.distingCoupenNumber(n); // calling distingCoupenNumber function of LogicalUtility for Generate N number of Disting Coupen
		
		System.out.println("main function of DistingCoupenNumber class will ended");
	}
}
package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To find a SqureRoot of number using NewtonMethod
 * 
 * @author Nikunj Balar
 *
 */
public class SqrtNewtonMethod {
	public static void main(String[] args) {
		//double c = Double.parseDouble(args[0]);
		
		double c=Utility.doubleInput();
		Utility.squreRoot(c);
	}
}
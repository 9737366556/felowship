package com.bridgelabs.functionalPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: to calculate Distance
 * 
 * @author Nikunj Balar
 *
 */
public class Distance {
	public static void main(String[] args) {
		System.out.println("main function for Distance class will start");

		System.out.println("Enter ending point");
		int m = Utility.integerInput();
		System.out.println("Enter ending point");
		int n = Utility.integerInput();

		/*// comand line input
		 * int m=Integer.parseInt(args[0]); 
		 * int n=Integer.parseInt(args[1]);
		 */
		System.out.println(Utility.distance(m, n));
		System.out.println(Math.round(Utility.distance(m, n)));
		System.out.println("main function for Distance class will ended");
	}
}
package com.bridgelabs.logicalPrograms.programs;

import com.bridgelabs.basicProgramming.utility.Utility;
import com.bridgelabs.logicalPrograms.utility.LogicalUtility;


/**
 * Purpose: To Count Number of Wins and Percentage of Win and Loss of Gambler.
 * 
 * @author Nikunj Balar
 *
 */
public class Gambler {
	public static void main(String[] args) {
		System.out.println("main function of class Gambler will Start");
		System.out.println("enter amount you have in hand");
		int stake = Utility.integerInput();		// calling integerInput function of Utility for reading standered input
		System.out.println("set the goal to win the meatch");
		int goal = Utility.integerInput();		// calling integerInput function of Utility for reading standered input
		System.out.println("enter number of time game will replay");
		int n = Utility.integerInput();			// calling integerInput function of Utility for reading standered input

		LogicalUtility.gambling(stake, goal, n);	// calling gambling function of LogicalUtility To Count Number of Wins and Percentage of Win and Loss of Gambler.
		System.out.println("main function of class Gambler will Ended");
	}
}
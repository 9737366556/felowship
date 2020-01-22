package com.bridgelabs.logicalPrograms;

import com.bridgelabs.utility.LogicalUtility;
import com.bridgelabs.utility.Utility;


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

		float percentage=LogicalUtility.gambling(stake, goal, n);	// calling gambling function of LogicalUtility To Count Number of Wins and Percentage of Win and Loss of Gambler.
		System.out.println("Percent of games won = " + percentage); // printing percentage of winning
		System.out.println("main function of class Gambler will Ended");
	}
}
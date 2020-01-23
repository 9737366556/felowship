package com.bridgelabs.basicProgramming;

import com.bridgelabs.utility.Utility;

/**
 * Purpose: For print percentage of Heads and Tails
 * 
 * @author Nikunj Balar
 *
 */
public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter number of times to Flip Coin");
		int n = Utility.integerInput();// taking input from user using integerInput() of Utility class

		float headPer=Utility.flipCoin(n);// calling flipCoin() from Utility class
		System.out.println("Head percentage "+headPer);
		System.out.println("Tail percentage " + (100- headPer));
	}

}

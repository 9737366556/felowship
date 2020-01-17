package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: To find number 
 * 
 * 
 * 
 * @author bridgeit
 *
 */
public class FindNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		int n = Utility.integerInput();
		int[] numbers = new int[n];
		int power = 1;
		for (int i = 0; i < numbers.length; i++) {
			power = power * 2;
			numbers[i] = power;
			System.out.println(numbers[i] + " ");
		}
		int num = Utility.binarySearchIneger(numbers, 0, n - 1);
		if (num != -1)
			System.out.println("number found at " + num + " position");
		else
			System.out.println("number not found");
	}
}

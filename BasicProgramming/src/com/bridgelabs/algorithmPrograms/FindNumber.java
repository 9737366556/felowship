package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: To find number 
 * 
 * 
 * @author Nikunj Balar
 */
public class FindNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		int n = Utility.integerInput();
		int[] numbers = new int[n];
		int power = 1;
		for (int i = 0; i < numbers.length; i++) {
			power = power * 2;
			numbers[i] = power; //Storing power of 2 into array at ith position
			System.out.println(numbers[i] + " ");
		}
		int num = Utility.binarySearchIneger(numbers, 0, n - 1); // return position of number if number found 
		if (num != -1)
			System.out.println("number found at " + num + " position");
		else //if number is -1 than number not found
			System.out.println("number not found");
	}
}

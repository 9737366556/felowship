package com.bridgelabs.algorithmPrograms;

import java.util.InputMismatchException;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: To Find the a number which is prime as well as anagram or prime as well as pelindrom
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class PrimeIsAnagramAndPelindrom {
	public static void main(String[] args) {
		try {
			System.out.println("enter the range of");
			int n = Utility.integerInput();
			boolean valid = false;
			boolean prime = false;
			boolean palindrom = false;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {

					prime = Utility.primeNumber(i);
					// return true if i is prime number
					if (prime) {
						int[] arr1 = Utility.intToArray(i);
						int[] arr2 = Utility.intToArray(j);
						 // return true if find any onther prime anagram number
						valid = Utility.anagramDetection(arr1, arr2);
						if (valid) {
							System.out.print("number is prime and anagram " + i);
							System.out.println();
						}
						palindrom = Utility.palindrom(i); 
						// return true if number is pelindrom
						if (palindrom) {
							System.out.print(" number is prime and palindrom " + i);
							System.out.println();
						}
						break;
					}
				}
			}
		} catch (NumberFormatException | InputMismatchException e) {
			System.out.println("you have an excewption in main function of PrimeIsAnagramAndPelindrom class exception class name is "+e.getClass());
		}
	}
}

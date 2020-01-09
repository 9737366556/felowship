package com.bridgelabs.basicProgramming.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Purpose: For code reusability
 * 
 * @author Nikunj Balar
 *
 */
public class Utility {

	InputStreamReader iSR = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(iSR);
	static Scanner s = new Scanner(System.in);

	// method for reading standerd input of type integer
	public static int integerInput() {
		return s.nextInt();// method for tasking integer input from user
	}

	// method for reading standerd input of type double
	public static double doubleInput() {
		return s.nextDouble();// method for tasking double input from user
	}

	// method for reading standerd input of type boolean
	public static boolean booleanInput() {
		return s.nextBoolean();// method for tasking boolean input from user
	}

	// method for reading standerd input of type integer
	public static String stringInput() {
		return s.nextLine();// method for tasking String input from user
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^replaceString^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// Method for replacing a perticular word of string
	public static void replaceString(String line, String replace, String addAtReplace) {
		String line2 = line.replace(replace, addAtReplace);
		System.out.println(line2);

	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^flipCoin^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for finding the percentage of heads vs tails
	public static void flipCoin(int n) {

		double[] d = new double[n];
		int head = 0;
		int tails = 0;
		for (int i = 0; i < d.length; i++) {
			d[i] = Math.random();// using random function for generating random number
			if (d[i] < 0.5) {
				tails++;
			} else {
				head++;
			}
		}
		float perHead = head * 100 / n;
		float perTail = 100 - perHead;

		System.out.println("head : " + head + " tails : " + tails);
		System.out.println("perHead : " + perHead + " perTail : " + perTail);
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^leapYear^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for cheake the given year is leap year or not
	public static void leapYear(int year) {
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^powerOfNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for finding the power of base number
	public static void powerOfNumber(int n, int base) {
		if (n < 31) {
			int power = 1;
			for (int i = 0; i < n; i++) {
				power *= base;
			}
			System.out.println(power);
		} else {
			System.out.println("Enter the power of base lesser than 31");
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^harmonicNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for finding Nth Harmonic number
	public static void harmonicNumber(int n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}
		System.out.println(sum);
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^factorization^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for calculate minimum prime factor of given number
	public static void factorization(int n) {
		for (int i = 2; i <= n; i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^twoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading data from standard input with different difference way
	public static void twoDArray(int m, int n) {
		System.out.println("Enter the type of data");
		System.out.println("1.integer  \t 2.floating point \t 3.True or False");
		int key = Utility.integerInput();// calling static integerInput function for reading key value
		switch (key) {
		case 1:
			intTwoDArray(m, n);// for reading and printing the standard input of integer type
			break;
		case 2:
			doubleTwoDArray(m, n);// for reading and printing the standard input of double type
			break;
		case 3:
			booleanTwoDArray(m, n);// for reading and printing the standard input of boolean type
			break;
		default: // if case will not found than default case will execute
			System.out.println("no such case available");
			break;
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^intTwoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading in 2D arrays of integers from from standard input and
	// printing them
	public static void intTwoDArray(int m, int n) {
		int[][] intArray = new int[m][n];// declaring two DArray
		System.out.println("Enter value");
		// for reading data from stander input
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				intArray[i][j] = Utility.integerInput();
			}
		}
		// for printing data of standard input
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println("");
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^doubleTwoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading in 2D arrays of double from from standard input and
	// printing them
	public static void doubleTwoDArray(int m, int n) {
		double[][] doubleArray = new double[m][n];// declaring two DArray
		System.out.println("Enter value");
		// for reading data from stander input
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				doubleArray[i][j] = Utility.doubleInput();
			}
		}
		// for printing data of standered input
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(doubleArray[i][j] + " ");
			}
			System.out.println("");
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^booleanTwoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading in 2D arrays of double from from standard input and
	// printing them
	public static void booleanTwoDArray(int m, int n) {
		boolean[][] booleanArray = new boolean[m][n];// declaring two DArray
		System.out.println("Enter value");
		// for reading data from stander input
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				booleanArray[i][j] = Utility.booleanInput();
			}
		}
		// for printing data of standered input
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(booleanArray[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
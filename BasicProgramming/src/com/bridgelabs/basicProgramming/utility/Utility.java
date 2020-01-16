package com.bridgelabs.basicProgramming.utility;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Purpose: For code reusability
 * 
 * @author Nikunj Balar
 *
 */
public class Utility {

	static Scanner s = new Scanner(System.in);

	// method for reading standerd input of type short
	public static short shortInput() throws NumberFormatException {
		return s.nextShort();// method for tasking short input from user
	}

	// method for reading standerd input of type integer
	public static int integerInput() throws NumberFormatException {
		return s.nextInt();// method for tasking integer input from user
	}

	// method for reading standerd input of type float
	public static float floatInput() throws NumberFormatException {
		return s.nextFloat();// method for taking float input from user
	}

	// method for reading standerd input of type double
	public static double doubleInput() throws NumberFormatException {
		return s.nextDouble();// method for taking double input from user
	}

	// method for reading standerd input of type boolean
	public static boolean booleanInput() throws NumberFormatException {
		return s.nextBoolean();// method for taking boolean input from user
	}

	// method for reading standerd input of type String
	public static String stringInput() throws NumberFormatException {
		return s.nextLine();// method for taking String input from user
	}

	// method for reading standerd input of type character
	public static char characterInput() throws NumberFormatException {
		return s.next().charAt(0); // method for taking character input from user
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^replaceString^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// Method for replacing a perticular word of string
	public static void replaceString(String line, String replace, String addAtReplace) {
		try {
			String line2 = line.replace(replace, addAtReplace);
			System.out.println(line2);
		} catch (Exception e) {
			System.err.println("you have an exception in replaceString function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^flipCoin^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for finding the percentage of heads vs tails
	public static void flipCoin(int n) {
		try {
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
		} catch (Exception e) {
			System.err.println("you have an exception in flipCoin function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^leapYear^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for cheake the given year is leap year or not
	public static void leapYear(int year) {
		try {
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
				System.out.println(year + " is leap year");
			} else {
				System.out.println(year + " is not leap year");
			}
		} catch (Exception e) {
			System.err.println("you have an exception in leapYear function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^powerOfNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for finding the power of base number
	public static int powerOfNumber(int n, int base) {
		int power = 0;
		try {
			power = 1;
			if (n < 31) {
				for (int i = 0; i < n; i++) {
					power *= base;
				}
			}

		} catch (Exception e) {
			System.err.println("you have an exception in powerOfNumber function of Utility " + e.getClass());
		}
		return power;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^harmonicNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for finding Nth Harmonic number
	public static void harmonicNumber(int n) {
		try {
			double sum = 0;
			for (double i = 1; i <= n; i++) {
				sum += 1 / i;
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.err.println("you have an exception in harmonicNumber function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^factorization^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for calculate minimum prime factor of given number
	public static void factorization(int n) {
		try {
			for (int i = 2; i <= n; i += 2) {
				while (n % i == 0) {
					System.out.print(i + " ");
					n /= i;
				}
			}
		} catch (Exception e) {
			System.err.println("you have an exception in factorization function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^twoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading data from standard input with different difference way
	public static void twoDArray(int m, int n) {
		try {
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
		} catch (Exception e) {
			System.err.println("you have an exception in twoDArray function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^intTwoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading in 2D arrays of integers from standard input and
	// printing them
	public static void intTwoDArray(int m, int n) {
		try {
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
		} catch (Exception e) {
			System.err.println("you have an exception in intTwoDArray function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^doubleTwoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading in 2D arrays of double from standard input and
	// printing them
	public static void doubleTwoDArray(int m, int n) {
		try {
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
		} catch (Exception e) {
			System.err.println("you have an exception in doubleTwoDArray function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^booleanTwoDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for reading in 2D arrays of double from standard input and
	// printing them
	public static void booleanTwoDArray(int m, int n) {
		try {
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
		} catch (Exception e) {
			System.err.println("you have an exception in booleanTwoDArray function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^sumOfThreeEZero^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for count Distinct Triplets which sum equals to zero and print them.

	public static void sumOfThreeEZero(int n) {
		try {
			int[] array = new int[n];
			int count = 0;
			System.out.println("Enter array element");
			for (int i = 0; i < array.length; i++) {
				array[i] = Utility.integerInput(); // reading input from standerd input using integerInput static
													// function
			}

			System.out.println("Distinct Triplets which sum equals to zero");
			for (int i = 0; i < array.length - 2; i++) {
				for (int j = i + 1; j < array.length - 1; j++) {
					for (int k = j + 1; k < array.length; k++) {
						if (array[i] + array[j] + array[k] == 0) {
							count++;
							System.out.println(array[i] + " " + array[j] + " " + array[k]);
						}
					}
				}
			}
			System.out.println("Number of Distinct Triplets " + count);
		} catch (Exception e) {
			System.err.println("you have an exception in sumOfThreeEZero function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^distance^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for computing distance
	public static double distance(int m, int n) {
		double result = 0.0;
		try {
			int base = 2;
			result = Math.sqrt((Utility.powerOfNumber(base, n) + Utility.powerOfNumber(base, m)));
		} catch (Exception e) {
			System.err.println("you have an exception in distance function of Utility " + e.getClass());
		}
		return result;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^quadraticEquation^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for calculation of quadraticEquation
	public static void quadraticEquation(int a, int b, int c) {
		try {
			int delta = b * b - 4 * a * c;
			if (delta > 0) {
				System.out.println("root are real or different");
				System.out.println((-b + Math.sqrt(delta)) / (2 * a));
				System.out.println((-b - Math.sqrt(delta)) / (2 * a));
			} else {
				System.out.println("root are complex");
				System.out.println((-b + Math.sqrt(delta)) / (2 * a));
				System.out.println((-b - Math.sqrt(delta)) / (2 * a));
			}
		} catch (Exception e) {
			System.err.println("you have an exception in quadraticEquation function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^currentTime^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// method for start Time in millisecond
	public static long nowTime() {
		long cTime = 0l;
		try {
			int n = Utility.integerInput();
			cTime = System.currentTimeMillis(); // return current time at the time of compilation
		} catch (Exception e) {
			System.err.println("you have an exception in nowTime function of Utility " + e.getClass());
		}
		return cTime;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^elapsesTime^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To measuring the time that elapses between the start and end clicks
	public static double elapseStartEnd() {
		double elapse = 0.0;
		try {
			System.out.println("press any number for start time");
			long start = Utility.nowTime();
			System.out.println("press any number for end time");
			long end = Utility.nowTime();
			elapse = (end - start) / 1000.0; // count elapse time = end time -start time
		} catch (Exception e) {
			System.err.println("you have an exception in elapseStartEnd function of Utility " + e.getClass());
		}
		return elapse; // return elapse time
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^elapsesTime^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To measuring the time that elapses between the start, pause, resume
	// and end clicks
	public static double elapseStartPauseEnd() {
		double elapse = 0.0;
		try {
			System.out.println("press any number for startTime time");
			long start = Utility.nowTime();
			System.out.println("press any number for pause time");
			long pause = Utility.nowTime();
			System.out.println("press any number for resume time");
			long resume = Utility.nowTime();
			System.out.println("press any number for endTime time");
			long end = Utility.nowTime();
			long pauseTime = resume - pause; // count total pauseTime =resume time - pause time
			elapse = (end - pauseTime - start) / 1000.0; // count elapse time = end time - pauseTime -start time
		} catch (Exception e) {
			System.err.println("you have an exception in elapseStartPauseEnd function of Utility " + e.getClass());
		}
		return elapse; // return elapse time
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^temperaturConversion^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// Function to calculate temperature given in Fahrenheit convert it into Celsius
	// or given in Celsius than convert it into Fahrenheit
	public static void temperaturConversion(double temperatur) {
		try {
			System.out.println("chose the given input is in");
			System.out.println("1.Fahrenheit \t 2.Celsius");
			char input = Utility.characterInput();
			switch (input) {
			case '1':
				double fTC = (temperatur - 32) * 5 / 9;
				System.out.println(temperatur + " Celsius =" + fTC + " Fahrenheit");
				break;
			case '2':
				double cTF = (temperatur * 9 / 5) + 32;
				System.out.println(temperatur + " Fahrenheit =" + cTF + " Celsius");
				break;
			default:
				System.out.println("no such choise is available");
				break;
			}
		} catch (Exception e) {
			System.err.println("you have an exception in temperaturConversion function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^monthlyPayment^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// fuction to calculate monthly payment
	public static void monthlyPayment(double p, double y, double r) {
		try {
			double n = 12 * y;
			double rate = r / (12 * 100);
			double payment = (p * rate) / (1 - Math.pow((1 + rate), -n));
			System.out.println("total monthly payment =" + payment);

			/*
			 * double n = 12 * y; double rate = r / (12 * 100); double payment = (p * rate)
			 * * (1 - (Math.pow(1 + rate, -n))); double total = p / (y * 12); double result
			 * = total + payment; System.out.println(result);
			 */
		} catch (Exception e) {
			System.err.println("you have an exception in monthlyPayment function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^squreRoot^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to calculate squreRoot using Newton Method
	public static void squreRoot(double c) {

		double t = c;
		double epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) { // using absulate funcion of math class and perform given
													// condition
			t = (c / t + t) / 2.0; // storing avg of c/t and t into t
		}
		System.out.println(t);

	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^toBinary^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to find binary represantion of given decimal number
	public static void toBinary(int num) {
		try {
			StringBuffer  s = new StringBuffer(8); // StringBuffer object to store binary represantation
			while (num > 0) {
				s.insert(0, num % 2);
				num = num / 2;
			}
			while (s.length() < 8) { // converting object into 8bit formate
				s.insert(0, 0);
			}
			System.out.println(s);
		} catch (Exception e) {
			System.err.println("you have an exception in toBinary function of Utility " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^swapNibbles^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to find nibbles of the given String
	public static void swapNibbles(int n) {
		try {
			int num = ((n & 0x0F) << 4 | (n & 0xF0) >> 4); // using 0F to & whose value is 0000 1111 to preserve
			// right side or F0 to & whose value is 1111 0000 to preserve left side
			System.out.println("New no is: " + num); // bits and left shifting them by 4
			Utility.toBinary(num); // using F0 to & whose value is 1111 0000 to preserve left side
			int count = 0;
			for (int i = 0; i < 8; i++) {
				if (num == Math.pow(2, i))
					count++;
			}
			if (count > 0)
				System.out.println("the new number is power of 2");
			else
				System.out.println("The new number is not power of 2");

		} catch (Exception e) {
			System.err.println("you have an exception in swapNibbles function of countCharacter " + e.getClass());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^countCharacter^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to count a character from the String
	public static int countCharacter(char c, String str) {
		int count = 0;
		try {
			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == ' ') {
					count++;
				}
			}
		} catch (Exception e) {
			System.out.println(
					"you have an exception in countCharacter function of countCharacter class " + e.getMessage());
		}
		return count;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^splitS^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to saperate word from String
	public static String[] splitS(char c, String str) {

		char[] array = str.toCharArray();
		int count = Utility.countCharacter(' ', str);
		int j = 0;

		StringBuffer ab = new StringBuffer();
		String[] words = new String[count + 1];
		count = 0;
		try {
			for (int i = 0; i < array.length; i++) {
				char[] a = new char[j + 1];
				if (array[i] == c) {
					words[count] = new String(ab);
					ab.delete(0, j);
					count += 1;
					j = 0;
				} else {
					a[j] = array[i];
					ab.append(a[j]);
					j++;
				}
				if (i == array.length - 1) {
					words[count] = new String(ab);
				}
			}

		} catch (Exception e) {
			System.out.println("you have an exception in countCharacter function of splitS class " + e.getMessage());
		}
		return words;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^splitS^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to saperate word from String
	public static int binarySearch(String word, String[] line, int first, int last) {
		try {
			while (first <= last) {
				int mid = first + (last - first) / 2;
				int res = word.compareTo(line[mid]);
				if (res == 0) {
					return mid;
				} else if (res > 0) {
					first = mid + 1;
				} else {
					last = mid - 1;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^bubbleSort^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to sort String array using bubble sort
	public static void bubbleSort(String line) {
		String[] words = Utility.splitS(' ', line); // converting String into string array
		String temp = "";
		for (int i = 0; i < words.length; ++i) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].compareTo(words[j]) > 0) { // comparing two word with the help of compareto method
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^insertionSort^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to sort String array using bubble sort
	public static void insertionSort(String line) {
		String[] words = Utility.splitS(' ', line); // converting String into string array
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int j = i;
			while (j > 0 && words[j - 1].compareTo(word) > 1) {
				words[j] = words[j - 1];
				j--;
			}
			words[j] = word;
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^anagramDetection^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check String is anagram or not for String
	public static Boolean anagramDetection(String s1, String s2) {
		boolean valid = false;
		try {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (ch1.length == ch2.length) {
				int n = ch1.length;
				for (int i = 0; i < n; i++) {
					if (ch1[i] == ch2[i]) {
						valid = true;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return valid;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^primeNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check the number is prime or note
	public static boolean primeNumber(int n) {

		boolean number = false;
		try {
			int num = 0;
			if (n != 0 && n != 1) {
				int mid = n / 2;
				if (n != 2) {
					for (int i = 2; i <= mid; i++) {
						if (n % i == 0) {
							num++;
						}
					}
				}
				if (num == 0) {
					number = true;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return number;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^primeNumberRange^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to find the range of prime numbers
	public static void primeNumberRange(int n) {
		try {
			for (int i = 2; i <= n; i++) {
				boolean number = Utility.primeNumber(i);
				if (number) {
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^intToCharacter^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to convert number into character arrray
	public static int[] intToArray(int i) {

		int n = 0;
		int[] arr = new int[n + 1];
		try {
			if (i / 10 == 0) {
				arr[n] = i % 10;
			}
			while (i / 10 > 0) {
				arr = new int[n + 1];
				arr[n] = i % 10;

				n++;
				i = i / 10;
				if (i / 10 == 0) {
					arr = new int[n + 1];
					arr[n] = i % 10;

				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return arr;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^anagramDetection^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check String is anagram or not for int array
	public static Boolean anagramDetection(int[] arr1, int[] arr2) {
		boolean valid = false;
		try {
			Arrays.sort(arr1); // sort the array
			Arrays.sort(arr2); // sort the array

			if (arr1.length == arr2.length) {
				int n = arr1.length;
				for (int i = 0; i < n; i++) {
					if (arr1[i] == arr2[i]) {
						valid = true;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return valid;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^pelindrom^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check number is pelindrom or not
	public static boolean palindrom(int i) {
		boolean valid = false;
		int n = i;
		int reminder = 0;
		int sum = 0;
		try {
			while (i > 0) {
				reminder = i % 10;
				sum = (sum * 10) + reminder;
				i = i / 10;
			}
			if (sum == n) {
				valid = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return valid;
	}
}
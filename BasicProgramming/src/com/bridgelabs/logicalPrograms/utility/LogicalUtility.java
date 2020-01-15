package com.bridgelabs.logicalPrograms.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: code reusability
 * 
 * @author Nikunj Balar
 *
 */
public class LogicalUtility {

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^gambling^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To count Number of Wins and Percentage of Win and Loss of Gambler.

	public static void gambling(int stake, int goal, int n) {
		int won = 0;
		int bets = 0;

		for (int i = 0; i < n; i++) {
			int amount = stake;
			while (amount > 0 && amount < goal) {
				bets++;
				if (Math.random() < 0.5) { // for getting n number of random number
					amount++; // he/she won the money so his/her money will increase
				} else {
					amount--; // he/she loss the money so his/her money will decrease
				}
			}
			if (amount == goal) { // gambeler will won one game
				won++; // for calculating how many game he/she will won
			}
		}
		double percentage = (won * 100.0) / n; // finding percentage of winning the bet
		double avgBets = bets / n; // finding average bet of the wall games
		System.out.println("out of " + n + " time gambler will won " + won + " time");
		System.out.println("Percent of games won = " + percentage); // printing percentage of winning
		System.out.println("Avg bets  = " + avgBets); // printing average bets of the total games
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^distingCoupenNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To generate disting coupen of n number

	public static void distingCoupenNumber(int n) {
		String s = "abcdefghijklmnopqrstuvwxyz123456789";
		char[] chars = s.toCharArray();
		int maximum = 1000000000;

		StringBuffer sb = new StringBuffer(); // creating String buffer object

		for (int i = 0; i < n; i++) { // for n time inner function working
			int random = (int) (Math.random() * maximum);
			while (random > 0) {
				sb.append(chars[random % chars.length]); // for adding one one character in StringBuffer
				random /= chars.length;
			}

			System.out.println("Coupon Code: " + sb); // printing String object
			int m = sb.length(); // finding length of string Object
			sb.delete(0, m); // delet all character of String object

		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^elapseStopwatch^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To calculate elapse time of stopwtch

	public static void elapseStopwatch() {
		System.out.println("chose any one from below");
		System.out.println(
				"1.Elapse time between start and end click \n2.elapse time between start, pause, resume and end click");
		int n = Utility.integerInput(); // creating 2 case for different requirement of user
		switch (n) {
		case 1:
			System.out.println(Utility.elapseStartEnd()); // elapse time for only start and end click
			break;
		case 2:
			System.out.println(Utility.elapseStartPauseEnd()); // elapse time fore start, pause, resume and end click
			break;
		default:
			System.out.println("no such function found");
			break;
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^dayOfWeek^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To find day of week
	public static int dayOfWeek(short d, short m, short y) {
		int year = y - (14 - m) / 12;
		int x = year + year / 4 - year / 100 + year / 400;
		int month = m + 12 * ((14 - m) / 12) - 2;

		int day = (d + x + (31 * month) / 12) % 7;
		return day;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^fileRead^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To read data from file and Store into word list
	public static void fileReadBinarySearch(String file) {
		BufferedReader br = null;
		try {
			System.out.println("enter word for search");
			String word = Utility.stringInput();
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] words;
			int find = 0;
			System.out.print(word +" find at posion :");
			while ((line = br.readLine()) != null) {
				words = Utility.splitS(' ', line);
				Arrays.sort(words);
				int first = 0;
				int last = words.length;

				find = Utility.binarySearch(word, words, first, last);
				if (find != -1) {
					System.out.print(find + ", ");
				}
			}
		} catch (IOException e) {
			System.err.println("you hava an exception in main function of BinarySearch " + e.getMessage());
			e.printStackTrace();
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^distingCoupenNumber^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function To generate disting coupen of n number

}

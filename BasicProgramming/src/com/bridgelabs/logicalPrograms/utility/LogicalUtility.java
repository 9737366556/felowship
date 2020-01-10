package com.bridgelabs.logicalPrograms.utility;

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
					amount++; //he/she won the money so his/her money will increase
				} else {
					amount--; //he/she loss the money so his/her money will decrease
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
		String s= "abcdefghijklmnopqrstuvwxyz123456789";
		char[] chars =s.toCharArray(); 
		int maximum = 1000000000;

		StringBuffer sb = new StringBuffer(); //creating String buffer object

		for (int i = 0; i < n; i++) { //for n time inner function working
			int random = (int) (Math.random() * maximum);
			while (random > 0) {
				sb.append(chars[random % chars.length]); //for adding one one character in StringBuffer
				random /= chars.length; 
			}

			System.out.println("Coupon Code: " + sb); // printing String object
			int m = sb.length(); //finding length of string Object
			sb.delete(0, m); // delet all character of String object

		}
	}
}

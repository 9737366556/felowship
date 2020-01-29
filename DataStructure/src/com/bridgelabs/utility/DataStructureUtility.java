package com.bridgelabs.utility;

import java.util.ArrayList;

/**
 * Purpose : Utility for code reuse
 * 
 * @author Nikunj Balar
 *
 */
public class DataStructureUtility {

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^balanceParentheses^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check parenthesis are balanced or not
	public static boolean balanceParentheses(String line) {
		StackUtility stack = new StackUtility();
		char[] ch = line.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				// push parenthesis into Stack
				stack.push(ch[i]);
			}
			if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
				char chh = (char) stack.peek();
				switch (ch[i]) {
				case ')':
					if (chh == '(')
						// pop parenthesis from stack
						stack.pop();
					break;
				case '}':
					if (chh == '{')
						// pop parenthesis from stack
						stack.pop();
					break;
				case ']':
					if (chh == '[')
						// pop parenthesis from stack
						stack.pop();
					break;
				default:
					break;
				}
			}
		}
		// display stack
		stack.show();
		// check stack is empty or not
		if (stack.isEmpty())
			// if stack is empty than return true
			return true;
		return false;
	}

	// function to calculating closing balance
	// add deposite amount and decrease by withdraw amount
	public static Double closingBalanced(int type, Double openingBalance, Double amount) {
		if (type == 1)
			openingBalance += amount;
		else
			openingBalance -= amount;
		return openingBalance;
	}

	// function to provide user choise and his/her amount
	public static double accountHolder(Double openingBalance) {
		double closingBalanced = openingBalance;
		System.out.println("Enter your choise");
		System.out.println("1.Deposit \t 2.withdrow \t 3.CheckBalance");
		int type = Utility.integerInput();
		double amount = 0;
		if (type == 1 || type == 2) {
			System.out.println("Enter your amount");
			amount = Utility.doubleInput();
		}
		if (type > 0 && type < 4) {
			switch (type) {
			case 1:
				// return amount by adding amount
				closingBalanced = closingBalanced(type, openingBalance, amount);
				break;

			case 2:
				// return amount by minimize amount
				closingBalanced = closingBalanced(type, openingBalance, amount);
				break;

			case 3:
				// show closing balance
				System.out.println(closingBalanced);
				break;

			default:
				break;
			}
		} else {
			System.out.println("enter valid choice");
		}
		return closingBalanced;
	}

	// adding user into queue and proccess there transaction
	public static double bankingCashCounter(int n) {
		QueueLinkedList queuelist = new QueueLinkedList();
		double openingBalance = 10000;
		// inserting user into queue
		for (int i = 0; i < n; i++) {
			queuelist.inserst(i);
		}
		// prosessing user transaction
		for (int i = 0; i < n; i++) {
			openingBalance = DataStructureUtility.accountHolder(openingBalance);
		}

		return openingBalance;
	}

	public static void pelindrom(DequeueLinkedList list) {
		while (list.isEmpty() != true && list.first().equals(list.last())) {
			list.removeFirst();
			list.removeLast();
		}
		list.show();
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^primeNumberArrayList^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check range of prime number
	public static ArrayList primeNumberArrayList(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			boolean number = Utility.primeNumber(i); // return true if number is prime
			if (number) {
				list.add(i);
			}
		}
		return list;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^primeNumberArrayList^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check range of prime number
	public static ArrayList<Integer> AnagramArrayList(int n) {
		boolean valid = false;
		// return the array of all prime number between in the range
		int[] arr = Utility.primeNumRange(n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// convert number into array
				int[] arr1 = Utility.intToArray(arr[i]);
				int[] arr2 = Utility.intToArray(arr[j]);
				// check for number is anagram or not
				valid = Utility.anagramDetection(arr1, arr2);
				if (valid == true) {
					list.add(arr[i]);
					break;
				}
			}
		}
		return list;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^primeNumberArrayList^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to check range of prime number
	public static StackUtility<Integer> anagramStackLinkedList(int n) {
		boolean valid = false;
		// return the array of all prime number between in the range
		int[] arr = Utility.primeNumRange(n);
		StackUtility<Integer> list=new StackUtility<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// convert number into array
				int[] arr1 = Utility.intToArray(arr[i]);
				int[] arr2 = Utility.intToArray(arr[j]);
				// check for number is anagram or not
				valid = Utility.anagramDetection(arr1, arr2);
				if (valid == true) {
					list.push(arr[i]);
					break;
				}
			}
		}
		return list;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^primeNumber2DArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to add prime number into 2D Array
	public static int[][] primeNumber2DArray(ArrayList<Integer> list) {
		int row = 11;
		int col = 30;
		int k = 0;
		int count = 0;
		int range = 100;
		int[][] arr = new int[row][col];
		// list.size() return size of ArrayList
		while (k < list.size()) {
			// check for the range of row
			if (((int) list.get(k)) > range) {
				range += 100;
				count = 0;
			}
			// for adding elemant into perticular position
			arr[list.get(k) / 100][count] = list.get(k);
			k++;
			count++;
		}
		return arr;
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^printsDArray^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to print 2D Array
	public static void printsDArray(int arr[][]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^anagramQueueLinkedList^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// function to find number that are anagram as well as prime using
	// queueLinkedlist
	public static QueueLinkedList<Integer> anagramQueueLinkedList(int n) {
		boolean anagram = false;
		QueueLinkedList<Integer> list = new QueueLinkedList<Integer>();
		// return array of prime numbers
		int[] arr = Utility.primeNumRange(n);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// converting number into array
				int[] arr1 = Utility.intToArray(arr[i]);
				int[] arr2 = Utility.intToArray(arr[j]);
				// check number is anagram or not
				anagram = Utility.anagramDetection(arr1, arr2);
				// if the number is anagram than add it into queueLinkedlist
				if (anagram) {

					list.inserst(arr[i]);
				}
			}
		}
		return list;
	}

}

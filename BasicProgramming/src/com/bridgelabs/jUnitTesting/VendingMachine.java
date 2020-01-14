package com.bridgelabs.jUnitTesting;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose:To find the Fewest Notes to be returned from Vending Machine
 * 
 * @author Nikunj Balar
 *
 */
public class VendingMachine {

	public static void main(String[] args) {
		try {
			System.out.println("1. plain chips");
			System.out.println("2. masala chips");
			System.out.println("3. masala masti chips");
			System.out.println("4. tomato chips");
			System.out.println("5. cream and onion chips");
			System.out.println("Enter your choise");
			int flavour = Utility.integerInput();
			if (0 < flavour && flavour < 6) {
				System.out.println("chose amount");
				System.out.println("1. 5rs. \t 2. 10rs. \t 3. 20rs. \t 4. 50rs.");
				int prise = Utility.integerInput();
				System.out.println("Enter quantity");
				int quantity = Utility.integerInput();

				product(prise, quantity);
				System.out.println("thank you for shopping");
			} else {
				System.out.println("enter valid option");
			}
		} catch (Exception e) {
			System.err.println("you have an exception in main function of VendingMachine " + e.getClass());
		}
	}

	private static void product(int prise, int quantity) {
		try {
			int totalAmt = 0;
			int cash = 0;
			int returnCash = 0;
			switch (prise) {
			case 1:
				totalAmt = 5 * quantity;
				System.out.println("your total :" + totalAmt);
				System.out.println("Enter cash");
				cash = Utility.integerInput();
				if (cash < totalAmt) {
					System.out.println("plz enter enough cash ");
				} else {
					returnCash = cash - totalAmt;
					returnNote(returnCash);
				}
				break;
			case 2:
				totalAmt = 10 * quantity;
				System.out.println("your total :" + totalAmt);
				System.out.println("Enter cash");
				cash = Utility.integerInput();
				if (cash < totalAmt) {
					System.out.println("plz enter enough cash ");
				} else {
					returnCash = cash - totalAmt;
					returnNote(returnCash);
				}
				break;
			case 3:
				totalAmt = 20 * quantity;
				System.out.println("your total :" + totalAmt);
				System.out.println("Enter cash");
				cash = Utility.integerInput();
				if (cash < totalAmt) {
					System.out.println("plz enter enough cash ");
				} else {
					returnCash = cash - totalAmt;
					returnNote(returnCash);
				}
				break;
			case 4:
				totalAmt = 50 * quantity;
				System.out.println("your total :" + totalAmt);
				System.out.println("Enter cash");
				cash = Utility.integerInput();
				if (cash < totalAmt) {
					System.out.println("plz enter enough cash ");
				} else {
					returnCash = cash - totalAmt;
					returnNote(returnCash);
				}
				break;

			default:
				System.out.println("this prise pack in not available");
				break;
			}
		} catch (Exception e) {
			System.err.println("you have an exception in product function of VendingMachine " + e.getClass());
		}
	}

	private static void returnNote(int returnCash) {
		try {
			int noteRtrn = 0;
			int count = 0;
			int[] note = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
			for (int i = 0; i < note.length; i++) {
				noteRtrn = returnCash / note[i];
				count += noteRtrn;
				if (noteRtrn != 0) {
					System.out.print(noteRtrn + " note of " + note[i] + " + ");
				}
				returnCash = returnCash % note[i];
			}
			System.out.println("\nminimum note return =" + count);
		} catch (Exception e) {
			System.err.println("you have an exception in returnNote function of VendingMachine " + e.getClass());
		}
		System.out.println("main function of VendingMachine class is ended");
	}
}

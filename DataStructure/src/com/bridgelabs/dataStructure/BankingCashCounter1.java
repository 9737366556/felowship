package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

 
/**
 * Purpose : To maintain the cash counter of the bank
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class BankingCashCounter1 {

	public static void main(String[] args) {
		try {
			// enter number of user
			System.out.println("Enter number of user");
			int n = Utility.integerInput();
			// return closing balance at the end of the day
			double openingBalance = DataStructureUtility.bankingCashCounter(n);
			System.out.println("closing balance at the end of the day :" + openingBalance);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

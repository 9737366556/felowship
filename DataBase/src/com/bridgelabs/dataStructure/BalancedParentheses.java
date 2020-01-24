package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.Utility;


/**
 * Purpose : To check parenthesis are balanced aur not using stack 
 * 
 * @author Nikunj Balar
 *
 */
public class BalancedParentheses {
	public static void main(String[] args) {
		try {
			System.out.println("Enter input");
			String line = Utility.stringInput();
			// calling balanceParentheses and it return boolean value
			boolean balanced=Utility.balanceParentheses(line);
			
			// if return true than parenthesis are balanced
			if (balanced) 
				System.out.println("parenthesis are balanced");
			else 
				System.out.println("parenthesis are not balanced");
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

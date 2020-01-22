package com.bridgelabs.basicProgramming;

import com.bridgelabs.utility.Utility;

/**
 * Purpose: For Replace String Template
 * 
 * @author Nikunj Balar
 *
 */
public class ReplaceStringTemplate {

	public static void main(String[] args) {
		System.out.println("Enter String ");
		String line = Utility.stringInput();// taking input from user using stringInput() of Utility class
		System.out.println("Enter String Which you want to replace");
		String replace = Utility.stringInput();// taking input from user using stringInput() of Utility class
		System.out.println("Enter word which you want to add");
		String addAtReplace = Utility.stringInput();// taking input from user using stringInput() of Utility class

		System.out.println(Utility.replaceString(line, replace, addAtReplace));// calling replaceString() from Utility class

	}

}

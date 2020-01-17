package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose: To check both the String are anagram or note
 * 
 *   
 * @author Nikunj Balar
 * 
 */
public class Anagram {
	public static void main(String[] args) {
		try {
			System.out.println("Enter the word");
			String s1 = Utility.stringInput();
			System.out.println("Enter Second word");
			String s2 = Utility.stringInput();
			Boolean detect=Utility.anagramDetection(s1, s2); //return true if both are anagram else return false
			if(detect) 
				System.out.println(s1+" " +s2 +"Both are anagram of each other");
			else
				System.out.println("both are not anagrame of each other");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}

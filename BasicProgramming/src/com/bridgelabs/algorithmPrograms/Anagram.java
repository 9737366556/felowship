package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		try {
			System.out.println("Enter the word");
			String s1 = Utility.stringInput();
			System.out.println("Enter Second word");
			String s2 = Utility.stringInput();
			Boolean detect=Utility.anagramDetection(s1, s2);
			if(detect) 
				System.out.println("both are anagram of each other");
			else
				System.out.println("both are not anagrame of each other");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}

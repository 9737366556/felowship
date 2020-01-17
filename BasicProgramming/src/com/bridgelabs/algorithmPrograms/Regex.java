package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.basicProgramming.utility.Utility;

public class Regex {
	public static void main(String[] args) {
		try {
			System.out.println("Enter your name");
			String name=Utility.stringInput();
			System.out.println("Enter your full name");
			String fullName=Utility.stringInput();
			System.out.println("enter mobilenumber");
			String phoneNumber=Utility.stringInput();
			System.out.println(Utility.getYourMSG(name , fullName, phoneNumber));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}

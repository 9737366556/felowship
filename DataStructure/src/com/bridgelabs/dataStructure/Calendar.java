package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.DataStructureUtility;

public class Calendar {

	public static void main(String[] args) {

		int month = 2;
		int year = 2020;
		int[][] aar = DataStructureUtility.createCalender(month, year);
		System.out.println("sun mon tue wed thu fri sat");
		// printing the array
		DataStructureUtility.printCalender(aar);
	}
}
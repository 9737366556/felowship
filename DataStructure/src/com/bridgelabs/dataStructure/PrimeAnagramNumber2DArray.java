package com.bridgelabs.dataStructure;

import java.util.ArrayList;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;


/**
 * Purpose : To Store the numbers that are prime aswell as anagrame into 2D Array
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class PrimeAnagramNumber2DArray {

	public static void main(String[] args) {
		try {
			System.out.println("Enter range");
			int n = Utility.integerInput();
			// return arraylist object that are prime and anagram
			ArrayList<Integer> list=DataStructureUtility.AnagramArrayList(n);
			// return 2D int array
			int[][] arr = DataStructureUtility.primeNumber2DArray(list);
			// for print 2d array
			DataStructureUtility.printsDArray(arr);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
}
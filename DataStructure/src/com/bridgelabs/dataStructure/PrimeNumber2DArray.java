package com.bridgelabs.dataStructure;

import java.util.ArrayList;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * Purpose : To print the rang of the array primenumber into 2D array
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class PrimeNumber2DArray {
	public static void main(String[] args) {
		try {
		System.out.println("Enter range");
		int n=Utility.integerInput();
		// return arraylist object
		ArrayList list= DataStructureUtility.primeNumberArrayList(n);
		// return 2D int array
		int [][]arr =DataStructureUtility.primeNumber2DArray(list);
		// for print 2d array
		DataStructureUtility.printsDArray(arr);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

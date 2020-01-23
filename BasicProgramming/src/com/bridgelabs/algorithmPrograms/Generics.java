package com.bridgelabs.algorithmPrograms;

import java.util.InputMismatchException;

import com.bridgelabs.utility.Utility;


/**
 * Purpose: To Sort the String and Search word from String
 * 
 *   
 * @author Nikunj Balar
 * 
 */
public class Generics {
	public static void main(String[] args) {
		try { // try catch for handle exception 
			System.out.println("enter String ");
			String s = Utility.stringInput();
			String arr[] = Utility.splitS(' ', s); //convert String into word array
			String arr2[] = Utility.bubbleSort(arr); // return sorted array 
			for (String str : arr) // Printing Sorted array
				System.out.print(str + " ");
			
			System.out.println("\nenter word what you want to search");
			String word=Utility.stringInput();
			int n= Utility.binarySearchGen(word, arr, 0, arr.length); // Search word from String    return position of the word
			if(n != -1)  
				System.out.println(word+" found at "+ (n+1) +"th position");
			else
				System.out.println("word not found");
			
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}

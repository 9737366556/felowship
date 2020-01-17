package com.bridgelabs.algorithmPrograms;

import java.util.InputMismatchException;

import com.bridgelabs.basicProgramming.utility.Utility;


/**
 * Purpose: To Sort a String using mearge sort
 * 
 *   
 * @author Nikunj Balar
 * 
 */
public class MergeSort {
	public static void main(String[] args) {
		try {
			System.out.println("enter the length of the array");
			int n = Utility.integerInput();
			System.out.println("enter array element");
			int[] arr = Utility.intArrayInput(n);
			meargeSort(arr, 0, arr.length - 1);// sort the array 
			
			for (int m : arr) { // printing sorted array
				System.out.print(m + " ");
			}
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println(e.getClass());
		}
	}

	public static void meargeSort(int[] arr, int first, int last) {
		try {
			if (first < last) {
				int mid = (first + last) / 2;

				meargeSort(arr, first, mid); // calling function recursively
				meargeSort(arr, mid + 1, last);
				merge(arr, first, mid, last); // calling function to mearge the araay
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	// function to merge to sorted array
	public static void merge(int[] arr, int first, int mid, int last) {
		try {
			int a = mid - first + 1;
			int b = last - mid;

			int[] left = new int[a];
			int[] right = new int[b];
			// dividing array into two array

			// initialise halfe array into left array
			for (int n = 0; n < a; n++) {
				left[n] = arr[first + n];
				System.out.println("left array" + left[n]);
			}

			// initialise halfe array into right array
			for (int m = 0; m < b; m++) {
				right[m] = arr[mid + 1 + m];
				System.out.println("right array" + right[m]);
			}

			int n = 0, m = 0;
			int o = first;
			while (n < a && m < b) {
				if (left[n] <= right[m]) { // compare two elemenet of the two array
					arr[o] = left[n]; // set value of nth element of left array at oth position of arr array
					n++;
				} else {
					arr[o] = right[m]; // set value of mth element of right array at oth position of arr array
					m++;
				}
				o++;
			}
			while (n < a) { // for printinig unstored array element of left array
				arr[o] = left[n];
				n++;
				o++;
			}
			while (m < b) { // for printinig unstored array element of right array
				arr[o] = right[m];
				m++;
				o++;
			}

		} catch (IndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
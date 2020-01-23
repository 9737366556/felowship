package com.bridgelabs.basicProgramming;

import com.bridgelabs.utility.Utility;

public class WeekProblem {
	public static void main(String[] args) {
		String s = "hi hello nikunj";
		String []words=Utility.splitS(' ', s);
		for (int i = 0; i < words.length; i++) {
			char []arr=words[i].toCharArray();
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
	}
}

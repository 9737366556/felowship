package com.bridgelabs.dataStructure;

import java.util.LinkedList;

import com.bridgelabs.utility.LinkedListUtility;
import com.bridgelabs.utility.Utility;

public class NumberHashing{
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		String sb=Utility.fileRead("/home/bridgeit/Desktop/txt file/hashing.txt");
		String[] ar= sb.split(" ");
		int []arr= new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			arr[i] = Integer.parseInt(ar[i]);
		}
		Object [] ob = new Object[11];
		for(int i = 0; i<11; i++) {
			ob[i] = new LinkedListUtility<Integer>();
		}
		
		int stack = 0;
		for(int i=0; i<arr.length; i++) {
			stack =arr[i] % 11;
			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[stack];	
			list.insert(arr[i]);
		}		
		for(int i=0; i<ob.length; i++) {
			LinkedListUtility<Integer> list = (LinkedListUtility)ob[i];
			System.out.println("Stack No "+i+" :=>");
			list.show();
			System.out.println();
		}
		
			

	}
}

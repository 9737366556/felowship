package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.HashingFunction;
import com.bridgelabs.utility.Utility;

public class NumberHashing<K, V>{
	
	public static void main(String[] args) {
		HashingFunction<Integer , Integer>   function=new HashingFunction<Integer, Integer>();
		String sb=Utility.fileRead("/home/bridgeit/Desktop/txt file/numbers.txt");
		String []words=sb.split(" ");
		
		int []arr=new int[words.length];
		
	}
}

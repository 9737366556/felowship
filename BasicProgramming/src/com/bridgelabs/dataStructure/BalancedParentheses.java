package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.StackUtility;
import com.bridgelabs.utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) {
		StackUtility stack = new StackUtility();
		String line=Utility.stringInput();
		char [] ch=line.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == '(' || ch[i] == '{' || ch[i] == '['  ) {
				stack.push(ch[i]);
			}
			if(ch[i] == ')' || ch[i] == '}' || ch[i] == ']' ) {
				char chh=(char) stack.peek();
				switch (ch[i]) {
				case ')':
					if(chh == '(') 
						stack.pop();
					break;
				case '}':
					if(chh == '{') 
						stack.pop();
					break;
				case ']':
					if(chh == '[') 
						stack.pop();
					break;
				default:
					break;
				}
			}
		}
		stack.show();
		if(stack.isEmpty()) 
			System.out.println("parentheses are balanced");
		else 
			System.out.println("Parentheses are not balanced");
	}
}

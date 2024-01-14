package com.bayoneproblems;

import java.util.Scanner;

public class UnbalancedBalancedUsingMethod {
	
	
	
	public static boolean validParentheses(String inputStr) {
		
	//	String inputStr;
		int i, length, j = 0, count = 0;
		char current, ch;
		
		// create an empty stack
		char[] stack = new char[20];

		// create an instance of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an expression to check whether it is balanced or not: \n");
		inputStr = sc.nextLine();

		// close Scanner class object
		sc.close();

		// get length of inputStr
		length = inputStr.length();

		// use the for loop for iterating input string
		for (i = 0; i < length; i++) {
			current = inputStr.charAt(i);

			// check whether current is '(', '{', '['
			if (current == '(' || current == '{' || current == '[') {
				stack[j] = current;
				j++; // increment counter j
				count = 1; // set count to 1
			} else if (current == ')') {
				if (count == 1) {
					j--;
				}
				ch = stack[j]; // store stack[j] to ch
				if (stack.length == 0 || ch != '(') {
					System.out.println("\n Unbalanced Parentheses!!");
			//		return;
				}
			} else if (current == '}') {
				if (count == 1)
					j--;
				ch = stack[j]; // store stack[j] to ch
				if (stack.length == 0 || ch != '{') {
					System.out.println("\n Unbalanced Parentheses!@#");
			//		return;
				}
			} else if (current == ']') {
				if (count == 1)
					j--;
				ch = stack[j]; // store stack[j] to ch
				if (stack.length == 0 || ch != '[') {
					System.out.println("\n Unbalanced Parentheses!^&*()");
			//		return;
				}
			}
}
		return false;
	}
		

	public static void main(String[] args) {

		UnbalancedBalancedUsingMethod ubm = new UnbalancedBalancedUsingMethod();
		
		String inputStr = "(){}[]";
		if(validParentheses(inputStr )) {
			System.out.println("The expression is valid: ");
		}else {
			System.out.println("The expressions is not valid");
		}
		
	//	ubm.validParentheses(inputStr);
	}

}

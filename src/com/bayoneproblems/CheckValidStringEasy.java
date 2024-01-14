package com.bayoneproblems;

import java.util.Scanner;
import java.util.Stack;

public class CheckValidStringEasy {

	public static void main(String[] args) {

		String programOutput = readFromInput();
	//	String programOutput = isStringValid(programInput);
		System.out.println(programOutput);
	}

	/*private static String isStringValid(String programInput) {
		// TODO Auto-generated method stub
		return null;
	}*/

	private static String readFromInput() {

		// Reading input
		Scanner input = new Scanner(System.in);
		System.out.println("***()###");
		System.out.println("Enter the String: ");
	//	String inString = input.nextLine();
		

		// Logic
		Stack<Character> stack = new Stack<>();
		String inStr = input.nextLine();
		for (char ch : inStr.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if ((ch == '}' && !stack.isEmpty() && stack.peek() == '{')
					|| (ch == ']' && !stack.isEmpty() && stack.peek() == '[')
					|| (ch == ')' && !stack.isEmpty() && stack.peek() == '(')) {
				stack.pop();
			} else {
				return "Invalid String";
			}

		}
		
	//	return stack.isEmpty()?"Valid String":"Invalid String";
		return "Valid String";
	}

}

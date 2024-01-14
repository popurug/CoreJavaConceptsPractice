package com.bayoneproblems;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesesExample {

	@SuppressWarnings("rawtypes")
	public static boolean balancedParentheses(String inputStr) {
		//Create an empty stack
		Stack stack = new Stack();
		
		//Convert inputStr to char array
		char[] charArray = inputStr.toCharArray();
		
		//Iterate charArray
		for(int i=0; i < charArray.length; i++) {
			
			//Get char
			char current = charArray[i];
			
			//Check whether current is '(', '[', '{'
			if(current == '{' || current == '[' || current == '(') {
				//push current to stack
				stack.push(current);
				continue;
			}
			
			//If stack is empty, return false
			if(stack.isEmpty()) {
				return false;
			}
			
			//Use switch statement to pop element from stack and if it is '(', '[', '{', return false
			boolean flag = true;
			char popChar;
			switch(current) {
			case ')':
				/*
				 popChar = (char)stack.pop();
				if(popChar == '{' || popChar == '[') 
					return false;
					break;
					
					case '}':
						popChar = (char)stack.pop();
						if(popChar == '(' || popChar == '[')
							return false;
						break;
						
					case ']':
						popChar = (char)stack.pop();
						if(popChar == '(' || popChar == '{')
							return false;
						break;
				}*/
				popChar = (char)stack.pop();
				flag = '(' == popChar;
				break;
			case '}':
				popChar = (char)stack.pop();
				flag = '{' == popChar;
				break;
			case ']':
				popChar = (char)stack.pop();
				flag = '[' == popChar;
				
			
			}
			if(!flag) return false;
		}
			return (stack.isEmpty());
		
	}

	public static void main(String[] args) {

		String inputStr;

		// Create an instance of scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an input string to check: ");
		// Take input from the user
		inputStr = sc.nextLine();

		// Call balancedParentheses() method to check whether input string is balanced
		// or not
		if (balancedParentheses(inputStr))
			System.out.println("Input String " + inputStr + " is balanced.");
		else
			System.out.println("Input String " + inputStr + " is not balanced.");

		sc.close();
	}

}

package com.object;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = s.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = s.nextInt();
		
		System.out.println("Enter required operation[+,-,*,/]: ");
		char operator = s.next().charAt(0);
		
		if(operator == '+' || operator == '-' || operator == '*' || operator == '/') {
		int res = calculate(num1, num2, operator);
		//System.out.println("The result is: " + res);
		System.out.println(num1+" "+operator+" "+num2+" = "+res);
		}else {
			System.out.println("Invalid Operations..Please try for +, -, *, /");
		}
		s.close();
	}
	
	//--method to perform operations
	static int calculate(int x, int y, char operator) {
		int res = 0;
		switch(operator)
		{
		case '+':
			res = x+y;
			break;
		case '-':
			res = x-y;
			break;
		case '*':
			res = x*y;
			break;
		case '/':
			res = x/y;
			break;
		}
        return res;
	}
}

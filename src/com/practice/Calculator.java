package com.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers: ");

		double first = s.nextDouble();
		double second = s.nextDouble();
		System.out.println("Enter An Operator (+, -, *, /): ");
		char operator = s.next().charAt(0);
		double result;

		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;

		default:
			System.out.println("Please select right operator");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}

}

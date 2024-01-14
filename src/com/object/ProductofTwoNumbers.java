package com.object;

import java.util.Scanner;

public class ProductofTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = s.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = s.nextInt();
		s.close();
	//	System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        
		System.out.println("The product of two numbers is: " + num1 + " * " + num2 + " = " + num1 * num2);
	}
}

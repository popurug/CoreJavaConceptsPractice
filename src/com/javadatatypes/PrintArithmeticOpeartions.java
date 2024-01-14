package com.javadatatypes;

import java.util.Scanner;

public class PrintArithmeticOpeartions {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = s.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = s.nextInt();

		System.out.printf("Sum of two numbers is: %d%n", num1 + num2);
		System.out.printf("Difference of two numbers is: %d%n", num1 - num2);
		System.out.printf("Product of two numbers is: %d%n", num1 * num2);
		System.out.printf("Average of two numbers is: %.2f%n", (double) (num1 + num2) / 2);
		System.out.printf("Distance of two integers is: %d%n", Math.abs(num1 - num2));
		System.out.printf("Max integer is: %d%n", Math.max(num1, num2));
		System.out.printf("Min integer is: %d%n", Math.min(num1, num2));
		s.close();
	}

}

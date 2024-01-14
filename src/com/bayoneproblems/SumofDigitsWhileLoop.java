package com.bayoneproblems;

import java.util.Scanner;

public class SumofDigitsWhileLoop {

	public static void main(String[] args) {

		int number, digit, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = s.nextInt();

		// Logic
		while (number > 0) {
			// Finds the last digit of the given number
			digit = number % 10;

			// Adds last digit to the variable sum
			sum = sum + digit;

			// Removes the last digit from the number
			number = number / 10;
		}

		// Prints the result
		System.out.println("Sum of digits is: " + sum);
		s.close();
	}

}

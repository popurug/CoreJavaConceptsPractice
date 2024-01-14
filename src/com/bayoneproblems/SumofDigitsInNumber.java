package com.bayoneproblems;

import java.util.Scanner;

public class SumofDigitsInNumber {

	public static void main(String[] args) {

		long number, sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = s.nextLong();

		// Logic
		for (sum = 0; number != 0; number = number / 10) {
			// Find the last digit and add it to the sum variable
			sum = sum + number % 10;

		}

		// Print the result
		System.out.println("The sum of digits of a given number is: " + sum);
	//	s.close();

	}

}

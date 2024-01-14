package com.bayoneproblems;

public class FunctionUsingSumofDigits {

	// Function that finds the sum of digits of a number
	static int findSum(int number) {
		// Variable that stores the sum
		int sum = 0;

		// Executes until the condition becomes false
		while (number != 0) {
			// Find the last digit from the number and add it to the variable sum
			sum = sum + number % 10;

			// Removes the last digit
			number = number / 10;
		}

		// Returns the sum
		return sum;

	}

	public static void main(String[] args) {

		int number = 14384;

		// Calling the user-defined method and prints the result
		System.out.println("The sum of digits: " + findSum(number));
	}

}

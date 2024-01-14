package com.javarecursivemethods;

public class CalculateSumOfAllNumbers {

	public static int calculateSum(int n) {
		// Base case: sum of 0 is 0
		if (n == 0) {
			return 0;
		}

		// Recursive case: add n with the sum of (n-1)
		return n + calculateSum(n - 1);
	}

	public static void main(String[] args) {

		int number = 5;
		int sum = calculateSum(number);
		System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
	}

}

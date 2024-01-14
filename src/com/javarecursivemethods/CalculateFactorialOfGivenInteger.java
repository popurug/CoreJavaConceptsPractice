package com.javarecursivemethods;

public class CalculateFactorialOfGivenInteger {

	public static int calculateFactorial(int n) {
		// Base case: factorial of 0 is 1
		if (n == 0) {
			return 1;
		}

		// Recursive case: multiply n with factorial of (n-1)
		return n * calculateFactorial(n - 1);
	}

	public static void main(String[] args) {

		int number = 7;
		int fact = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
		number = 12;
		fact = calculateFactorial(number);
		System.out.println("\n Factorial of " + number + " is: " + fact);
		number = 5;
		fact = calculateFactorial(number);
		System.out.println("\n Factorial of " + number + " is: " + fact);
	}

}

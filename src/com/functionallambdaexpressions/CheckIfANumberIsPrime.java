package com.functionallambdaexpressions;

import java.util.function.Predicate;

public class CheckIfANumberIsPrime {

	public static void main(String[] args) {

		// Define the prime check lambda expression
		Predicate<Integer> isPrime = n -> {
			if (n <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};

		// Check if a number is prime using the lambda expression
		int n = 17;
		boolean isPrimeResult = isPrime.test(n);
		// Print the prime check result
		System.out.println(n + " is prime? " + isPrimeResult);

		// Check if a number is prime using the lambda expression
		int n1 = 15;
		boolean isPrimeResult1 = isPrime.test(n1);
		// Print the prime check result
		System.out.println(n1 + " is prime? " + isPrimeResult1);
	}

}

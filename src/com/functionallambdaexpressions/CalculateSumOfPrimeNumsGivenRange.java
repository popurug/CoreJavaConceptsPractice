package com.functionallambdaexpressions;

import java.util.stream.IntStream;

public class CalculateSumOfPrimeNumsGivenRange {

	public static void main(String[] args) {

		int startPrime = 100;
		int endPrime = 200;

		// Calculate the sum of prime numbers using lambda expression
		int sumOfPrimes = IntStream.rangeClosed(startPrime, endPrime).filter(CalculateSumOfPrimeNumsGivenRange::isPrime)
				.sum();
		System.out.println("Sum of prime numbers between " + startPrime + " and " + endPrime + ": " + sumOfPrimes);
	}

	// Lambda expression to check if a number is prime
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}

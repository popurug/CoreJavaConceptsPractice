package com.functionallambdaexpressions;

import java.util.stream.LongStream;

public class FindLargestPrimeFactorOfGivenNumber {

	public static void main(String[] args) {

		int n = 176;
		System.out.println("Number is: " + n);

		long largestPrimeFactor = findLargestPrimeFactor(n);
		System.out.println("Largest prime factor is: " + largestPrimeFactor);
		n = 36;
		System.out.println("\n Number is: " + n);

		largestPrimeFactor = findLargestPrimeFactor(n);
		System.out.println("Largest prime factor is: " + largestPrimeFactor);
	}

	public static long findLargestPrimeFactor(long n) {
		for (long i = (long) Math.sqrt(n); i >= 2; i--) {
			if (n % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return n;

	}

	public static boolean isPrime(long number) {
		return LongStream.rangeClosed(2, (long) Math.sqrt(number)).allMatch(n -> number % n != 0);
	}

}

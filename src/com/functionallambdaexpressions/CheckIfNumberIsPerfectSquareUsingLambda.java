package com.functionallambdaexpressions;

import java.util.function.Predicate;

public class CheckIfNumberIsPerfectSquareUsingLambda {

	public static void main(String[] args) {

		// Define the perfect square check lambda expression
		Predicate<Integer> isPerfectSquare = n -> {
			int sqrt = (int) Math.sqrt(n);
			return sqrt * sqrt == n;

		};

		// Test the lambda expression with some numbers
		int N = 36;
		boolean result = isPerfectSquare.test(N);
		System.out.println(N + " is a perfect square? " + result);

		int N1 = 26;
		boolean result1 = isPerfectSquare.test(N1);
		System.out.println(N1 + " is a perfect square? " + result1);

		int N2 = 10000;
		boolean result2 = isPerfectSquare.test(N2);
		System.out.println(N2 + " is a perfect square? " + result2);
	}

}

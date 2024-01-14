package com.functionallambdaexpressions;

import java.util.function.LongUnaryOperator;

public class CalculateFactorialOfAGivenNumber {

	public static void main(String[] args) {

		LongUnaryOperator factorial = n -> {
			long result = 1;
			for (long i = 1; i <= n; i++) {
				result *= i;
			}
			return result;

		};

		// Calculate the factorial of a number using the lambda expression.
		long n = 5;
		long factorialResult = factorial.applyAsLong(n);

		// Print the factorial result
		System.out.println("Factorial of " + n + " is: " + factorialResult);
	}

}

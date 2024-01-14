package com.functionallambdaexpressions;

import java.util.function.BiFunction;

public class ConcatenateTwoStringsUsingLambdaExpression {

	public static void main(String[] args) {

		// Define the concatenate lambda expression
		BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

		// Concatenate two strings using the lambda expression
		String s1 = "Good ";
		String s2 = "Morning!";
		System.out.println("The original strings: " + s1 + ", " + s2);
		String result = concatenate.apply(s1, s2);

		// Print the concatenated string
		System.out.println("\n Concatenated string: " + result);
	}

}

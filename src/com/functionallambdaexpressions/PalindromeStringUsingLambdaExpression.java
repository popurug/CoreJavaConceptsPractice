package com.functionallambdaexpressions;

import java.util.function.Predicate;

public class PalindromeStringUsingLambdaExpression {

	public static void main(String[] args) {

		// Define the palindrome check lambda expression
		Predicate<String> isPalindrome = str -> {
			String reversed = new StringBuilder(str).reverse().toString();
			return str.equals(reversed);
		};

		// Check if a string is a palindrome using the lambda expression
		String word1 = "Madam";
		boolean isPalindromeResult1 = isPalindrome.test(word1);
		System.out.println(word1 + " is a palindrome? " + isPalindromeResult1);

		String word2 = "Radar";
		isPalindromeResult1 = isPalindrome.test(word2);
		System.out.println(word2 + " is a palindrome? " + isPalindromeResult1);

		String word3 = "defined";
		isPalindromeResult1 = isPalindrome.test(word3);
		System.out.println(word3 + " is a palindrome? " + isPalindromeResult1);

		String word4 = "dad";
		isPalindromeResult1 = isPalindrome.test(word4);
		System.out.println(word4 + " is a palindrome? " + isPalindromeResult1);
	}

}

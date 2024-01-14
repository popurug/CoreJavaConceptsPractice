package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfAllOddEvenNumbersInList {

	public static void main(String[] args) {

		// Create a list of integers
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Original list elements: " + nums);

		// Calculate the sum of squares of odd numbers using lambda expression
		int sumSquaresOdd = nums.stream().filter(n -> n % 2 != 0).mapToInt(n -> n * n).sum();

		// Calculate the sum of squares of even numbers using lambda expression
		int sumSquaresEven = nums.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

		// Print the result
		System.out.println("\n Sum of squares of odd numbers: " + sumSquaresOdd);
		System.out.println("\n Sum of squares of even numbers: " + sumSquaresEven);

	}

}

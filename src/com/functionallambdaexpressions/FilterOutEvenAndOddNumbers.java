package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutEvenAndOddNumbers {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

		// Print the original numbers
		System.out.println("Original numbers are: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		// Filter out even numbers using lambda expressions
		List<Integer> evenNumbers = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		// Print the even numbers
		System.out.println("\n Even numbers: ");
		for (int num : evenNumbers) {
			System.out.println(num + " ");
		}

		// Filter out odd numbers using lambda expressions
		List<Integer> oddNumbers = nums.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());

		// Print the odd numbers
		System.out.print("\n Odd numbers: ");
		for (int num : oddNumbers) {
			System.out.println(num + " ");
		}
	}

}

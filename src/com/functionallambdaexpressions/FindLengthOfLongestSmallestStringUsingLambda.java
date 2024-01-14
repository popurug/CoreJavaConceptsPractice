package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class FindLengthOfLongestSmallestStringUsingLambda {

	public static void main(String[] args) {

		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

		System.out.println("Elements of the list are: " + colors);

		// Find the length of the longest string using lambda expression
		int maxLength = colors.stream().mapToInt(String::length).max().orElse(0);

		// Print the length of the longest string
		System.out.println("Length of the longest string: " + maxLength);

		// Find the length of the smallest string using lambda expression
		int minLength = colors.stream().mapToInt(String::length).min().orElse(0);

		// Print the length of the smallest string
		System.out.println("Length of the smallest string: " + minLength);
	}

}

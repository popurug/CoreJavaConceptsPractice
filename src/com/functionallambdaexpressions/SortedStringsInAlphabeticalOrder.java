package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class SortedStringsInAlphabeticalOrder {

	public static void main(String[] args) {

		List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

		// Print original list of strings
		System.out.println("Original strings: ");
		for (String str : colors) {
			System.out.println(str + ' ');
		}

		// Sort the list of strings in alphabetical order using lambda expression
		colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

		// Print the sorted list of strings
		System.out.println("\n Sorted strings: ");
		for (String str : colors) {
			System.out.println(str + ' ');
		}
	}

}

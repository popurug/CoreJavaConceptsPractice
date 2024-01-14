package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStrings {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Red", "Green", "Blue", "Pink", "Black", "Violet");

		// Print the original strings
		System.out.println("\n Original strings: ");
		for (String str : stringList) {
			System.out.println(str);
		}

		// Convert strings to lower case
		stringList.replaceAll(str -> str.toLowerCase());

		// Print the list of lower case strings
		System.out.println("\n Lowercase strings: ");
		for (String str : stringList) {
			System.out.println(str);
		}

		// Convert strings to upper case
		stringList.replaceAll(str -> str.toUpperCase());

		// Print the list of upper case strings
		System.out.println("\n Uppercase strings: ");
		for (String str : stringList) {
			System.out.println(str);
		}

	}

}

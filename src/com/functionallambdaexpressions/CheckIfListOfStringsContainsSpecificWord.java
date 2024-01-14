package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckIfListOfStringsContainsSpecificWord {

	public static void main(String[] args) {

		// Create a list of strings
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

		// Specify the word to search for
		String searchColor = "Orange";

		// Check if the list contains the specified color using a lambda expression
		Predicate<String> containsWord = word -> word.equals(searchColor);
		boolean flag = colors.stream().anyMatch(containsWord);

		// Print the result
		System.out.println("Is the word " + searchColor + " present in the list? " + flag);

		// Specify the word to search for
		String searchColor1 = "White";

		// Check if the list contains the specified color using a lambda expression
		Predicate<String> containsWord1 = word -> word.equals(searchColor1);
		boolean flag1 = colors.stream().anyMatch(containsWord1);

		// Print the result
		System.out.println("\n Is the word " + searchColor1 + " present in the list? " + flag1);
		
		String serachColor2 = "Brown";
		
		Predicate<String> containsWord2 = word -> word.equals(serachColor2);
		boolean flag2 = colors.stream().anyMatch(containsWord2);
		
		System.out.println("\n Is the word " + serachColor2 + " present in the list? " + flag2);
	}

}

package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListOfStringsAllUppercaseOrLowrecase {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Java", "JAVA", "java");
		System.out.println("Array elements are: " + strings);

		// Check if the list is all uppercase using lambda expression
		boolean isAllUppercase = checkCase(strings, s -> s.equals(s.toUpperCase()), String::toUpperCase);
		System.out.println("Is all uppercase? " + isAllUppercase);

		// Check if the list is all lowercase using lambda expression
		boolean isAllLowercase = checkCase(strings, s -> s.equals(s.toLowerCase()), String::toLowerCase);
		System.out.println("Is all lowercase? " + isAllLowercase);

		// Check if the list is mixed case
		boolean isMixedCase = !isAllUppercase && !isAllLowercase;
		System.out.println("Is all mixedcase? " + isMixedCase);

		List<String> strings1 = Arrays.asList("JAVA", "PYTHON", "DOTNET");
		System.out.println("\n Array elements are: " + strings1);

		// Check if the list is all uppercase using lambda expression
		isAllUppercase = checkCase(strings1, s -> s.equals(s.toUpperCase()), String::toUpperCase);
		System.out.println("Is all uppercase? " + isAllUppercase);

		// Check if the list is all lowercase using lambda expression
		isAllLowercase = checkCase(strings1, s -> s.equals(s.toLowerCase()), String::toLowerCase);
		System.out.println("Is all lowercase? " + isAllLowercase);

		// Check if the list is mixed case
		isMixedCase = !isAllUppercase && !isAllLowercase;
		System.out.println("Is mixed case? " + isMixedCase);

		List<String> strings2 = Arrays.asList("java");
		System.out.println("\n Array elements are: " + strings2);

		// Check if the list is all uppercase using lambda expression
		isAllUppercase = checkCase(strings2, s -> s.equals(s.toUpperCase()), String::toUpperCase);
		System.out.println("Is all uppercase? " + isAllUppercase);

		// Check if the list is all lowercase using lambda expression
		isAllLowercase = checkCase(strings2, s -> s.equals(s.toLowerCase()), String::toLowerCase);
		System.out.println("Is all lowercase? " + isAllLowercase);

		// Check if the list is mixed case
		isMixedCase = !isAllUppercase && !isAllLowercase;
		System.out.println("Is mixed case? " + isMixedCase);

	}

	public static boolean checkCase(List<String> strings, Predicate<String> checkFunction,
			Function<String, String> convertFunction) {
		String firstString = strings.get(0);
		String convertedString = convertFunction.apply(firstString);

		return strings.stream().allMatch(s -> checkFunction.test(s));
	}

}

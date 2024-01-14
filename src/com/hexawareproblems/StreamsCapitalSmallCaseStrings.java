package com.hexawareproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCapitalSmallCaseStrings {

	public static void main(String[] args) {

		List<String> colors = Arrays.asList("RED", "GrEEn", "white", "Orange", "pink");
		System.out.println("List of strings: " + colors);
		
		//Convert strings to uppercase using streams
		List<String> capitalStrings = colors.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("\nCapitalCase strings: " + capitalStrings);
		
		//Convert strings to lowercase using streams
		List<String> lowerStrings = colors.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println("\nLowerCase strings: " + lowerStrings);
	}

}

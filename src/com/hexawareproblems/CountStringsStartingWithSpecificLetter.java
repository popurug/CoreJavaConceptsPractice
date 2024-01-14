package com.hexawareproblems;

import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithSpecificLetter {

	public static void main(String[] args) {

		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown", "Black", "Purple");
		System.out.println("Original list of strings (colors): " + colors);
		char startLetter = 'B';
		//Count strings starting with a specific letter
		long ctr = colors.stream()
				.filter(s -> s.startsWith(String.valueOf(startLetter)))
				.count();
		System.out.println("\n Number of colors starting with '" + startLetter + "': " + ctr);
		
		char startLetter2 = 'P';
		//Count strings starting with a specific letter
		ctr = colors.stream()
				.filter(s -> s.startsWith(String.valueOf(startLetter2)))
				.count();
		System.out.println("\n Number of colors starting with '" + startLetter2 + "': " + ctr);
		
		char startLetter1 = 'Y';
		//Count strings starting with a specific letter
		ctr = colors.stream()
				.filter(s -> s.startsWith(String.valueOf(startLetter1)))
				.count();
		System.out.println("\n Number of colors starting with '" + startLetter1 + "': " +ctr);
	}

}

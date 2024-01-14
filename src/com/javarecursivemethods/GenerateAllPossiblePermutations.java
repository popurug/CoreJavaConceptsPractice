package com.javarecursivemethods;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPossiblePermutations {

	public static List<String> generatePermutations(String str) {
		List<String> permutations = new ArrayList<>();
		generatePermutationsHelper(str, "", permutations);
		return permutations;
	}

	public static void generatePermutationsHelper(String str, String current, List<String> permutations) {
		// Base case: If the string is empty, add the current permutation to the list
		if (str.isEmpty()) {
			permutations.add(current);
		}

		// Recursive case: for each character in the string, generate permutations by
		// appending
		// the character to the current permutation, and recursively call the method
		// with the
		// remaining characters as the new string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			generatePermutationsHelper(remaining, current + ch, permutations);
		}
	}

	public static void main(String[] args) {

		String str = "abc";
		List<String> permutations = generatePermutations(str);
		System.out.println("Permutations of \"" + str + "\":");
		for (String permutation : permutations) {
			System.out.println(permutation);
		}
	}

}

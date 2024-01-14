package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringsAreAnagramsUsingScanner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String s1 = s.nextLine();
		System.out.println("Enter the second String: ");
		String s2 = s.nextLine();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() == s2.length()) {
			// Convert strings to char array
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();

			// Sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// If sorted char arrays are same
			// then the strings are anagrams
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(s1 + " and " + s2 + " are anagrams. ");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams. ");
			}
		}
		s.close();

	}

}

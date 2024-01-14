package com.arrays;

import java.util.Arrays;

public class CheckTwoStringsAreAnagrams {

	public static void main(String[] args) {

		String s1 = "Race";
		String s2 = "Care";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() == s2.length()) {
			// Convert strings to char array
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();

			// Sort the charArray
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// If the sorted char arrays are same then
			// the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams");
			} /*
				 * else { System.out.println(s1 + " and " + s2 + " are not anagrams"); }
				 */
		}
	}

}

package com.javarecursivemethods;

public class ReverseAGivenString {

	public static String reverseString(String str) {
		// Base case: If the string is empty or has only one character, it is already
		// reversed
		if (str.isEmpty() || str.length() == 1) {
			return str;
		}

		// Recursive case: reverse the substring starting from the second character and
		// concatenate the first character
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {

		String str = "Java, World!!";
		String reversedStr = reverseString(str);
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedStr);
	}

}

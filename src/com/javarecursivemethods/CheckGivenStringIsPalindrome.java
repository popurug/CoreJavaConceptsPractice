package com.javarecursivemethods;

public class CheckGivenStringIsPalindrome {

	public static boolean isPalindrome(String str) {
		// Base case: An empty string or a string with one character is a palindrome
		if (str.length() <= 1) {
			return true;
		}

		// Recursive case: check if first and last characters are equal,
		// and recursively check if the substring between them is a palindrome
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);

		if (firstChar != lastChar) {
			return false;
		}

		String remainingSubstring = str.substring(1, str.length() - 1);
		return isPalindrome(remainingSubstring);
	}

	public static void main(String[] args) {

		String p1 = "madam";
		boolean isPalindrome1 = isPalindrome(p1);
		System.out.println(p1 + " is a palindrome: " + isPalindrome1);

		String p2 = "level";
		boolean isPalindrome2 = isPalindrome(p2);
		System.out.println(p2 + " is a palindrome: " + isPalindrome2);

		String p3 = "java";
		boolean isPalindrome3 = isPalindrome(p3);
		System.out.println(p3 + " is a palindrome: " + isPalindrome3);
	}

}

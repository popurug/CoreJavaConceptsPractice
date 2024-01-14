package com.object;

public class StringReverseWords {
	public void reverseWordInMyString(String str) {
		/*
		 * The split() method of String class splits a string in several strigns based
		 * on the delimeter passed as an argument to it
		 */
		String[] words = str.split("");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				/*
				 * The charAt() function returns the character at the given position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String[] args) {
		StringReverseWords s = new StringReverseWords();
		s.reverseWordInMyString("Welcome to my BeginnersBook");
		s.reverseWordInMyString("This is hello world program of java");
	}
}

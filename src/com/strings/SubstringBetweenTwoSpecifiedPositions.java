package com.strings;

public class SubstringBetweenTwoSpecifiedPositions {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";
		String s1 = "How are you doing today";
		String s2 = "How is the day going so far?";
		
		//Get a substring of the above string starting from
		//index 10 and ending at index 26.
		String new_str = str.substring(10, 26);
		String new_str1 = s1.substring(6, 16);
		String new_str2 = s2.substring(5, 15);
		
		//Display the two strings for comparison.
		System.out.println("Original string is: " + str);
		System.out.println("New substring is: " + new_str);
		System.out.println("**************");
		System.out.println("Original string is: " + s1);
		System.out.println("New substring is: " + new_str1);
		System.out.println("****()%%%%%%%");
		System.out.println("Original string is: " + s2);
		System.out.println("New substring is: " + new_str2);
		
	}

}

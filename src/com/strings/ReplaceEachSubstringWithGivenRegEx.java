package com.strings;

public class ReplaceEachSubstringWithGivenRegEx {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";
		String s1 = "Welcome to my java programming language:";
		String s2 = "How is the day going so far???";
		String s3 = "How are you doing today??";
		
		//Replace all 'dog' with 'cat'
		String new_str = str.replaceAll("fox", "cat");
		String str1 = s1.replaceAll("java", "bava");
		String str2 = s2.replaceAll("day", "bay");
		String str3 = s3.replaceAll("today", "tomorrow");
		
		//Display the strings for comparison
		System.out.println("Original string is: " + str);
		System.out.println("New string is: " + new_str);
		System.out.println("*******()!!!!!!!!!!");
		System.out.println("Original string is: " + s1);
		System.out.println("New string is: " + str1);
		System.out.println("******()@@@@@@");
		System.out.println("Original string is: " + s2);
		System.out.println("New string is: " + str2);
		System.out.println("^^^^^()@@@@@()!!!!!");
		System.out.println("Original string is: " + s3);
		System.out.println("New string is: " + str3);
	}

}

package com.strings;

public class StringConcatenation {

	public static void main(String[] args) {

		String s1 = "Welcome to my";
		String s2 = " java world";
		
		System.out.println("The first string is: " + s1);
		System.out.println("The second string is: " + s2);
		
		//Concatenate the two strings togeather
		String s3 = s1.concat(s2);
		
		//Display the new string
		System.out.println("The concatenated string is: " + s3);
	}

}

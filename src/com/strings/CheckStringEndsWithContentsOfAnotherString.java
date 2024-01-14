package com.strings;

public class CheckStringEndsWithContentsOfAnotherString {

	public static void main(String[] args) {

		String s1 = "Welcome to my java programs";
		String s2 = "Welcome to my javascript program";
		
		//The string to check the above two strings to see
		//If they end with this value (program).
		String end_str = "program";
		
		//Check first two strings end with end_str
		boolean ends1 = s1.endsWith(end_str);
		boolean ends2 = s2.endsWith(end_str);
		
		//Display the result of the endsWith calls.
		System.out.println("\"" + s1 + "\" ends with " + "\"" + end_str + "\"" + end_str + "\"? " + ends1);
		System.out.println("\"" + s2 + "\" ends with " + "\"" + end_str + "\"" + end_str + "\"? " + ends2);
	}

}

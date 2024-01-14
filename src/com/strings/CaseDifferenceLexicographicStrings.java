package com.strings;

public class CaseDifferenceLexicographicStrings {

	public static void main(String[] args) {

		String s1 = "This is exercise 1";
		String s2 = "This is Exercise 1";
		
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
		
		//Compare the two strings
		int result = s1.compareToIgnoreCase(s2);
		
		//Display the results of the comparision
		if(result < 0) {
			System.out.println("\"" + s1 + "\"" + " is less than " + "\"" + s2 + "\"");
		}else if(result == 0) {
			System.out.println("\"" + s1 + "\"" + " is equals to " + "\"" + s2 + "\"");
		}else if(result > 0) {
			System.out.println("\"" + s1 + "\"" + " is greater than " + "\"" + s2 + "\"");
		}
	}

}

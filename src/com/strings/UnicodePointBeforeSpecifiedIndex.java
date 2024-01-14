package com.strings;

public class UnicodePointBeforeSpecifiedIndex {

	public static void main(String[] args) {

	/*	String str = "Tutorialspoint.com";
		System.out.println("The original string is: " + str);
		
		//code point before index 1
		int val1 = str.codePointBefore(1);
		//code point before index 9
		int val2 = str.codePointBefore(9);
		
		System.out.println("Character (unicode point) = " + val1);
		System.out.println("Character (unicode point) = " + val2); */
		
		String str = "w3resource.com";
		System.out.println("The original string is: " + str);
		
		//code point from index 1 to index 10
		int count = str.codePointCount(1, 10);
		
		System.out.println("Codepoint count is: " + count);
	}

}

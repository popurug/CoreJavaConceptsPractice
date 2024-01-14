package com.strings;

public class TrimWhiteSpacesFromString {

	public static void main(String[] args) {

		String s1 = "   My name is Gopinath Popuru   ";
		String s2 = "   Welcome to my Java Programming World!!";
		String s3 = "   Nishanth Bandala";
		
		//Trim white space from front and back of the String
		String trimStr = s1.trim();
		String newStr = s2.trim();
		String newStr1 = s3.trim();
		
		//Display both strings for comparison
		System.out.println("Original string is: " + s1);
		System.out.println("New trimmed string is: " + trimStr);
		System.out.println("*******************");
		System.out.println("Original string is: " + s2);
		System.out.println("New trimmed string is: " + newStr);
		System.out.println("*******************");
		System.out.println("Original string is: " + s3);
		System.out.println("New trimmed string is: " + newStr1);
	}

}

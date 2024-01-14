package com.strings;

public class ConvertAllCharsInStrToLowerCase {

	public static void main(String[] args) {

		String str = "The Quick BroWn Fox!!";
		String s1 = "Welcome to my Java Programming world!!";
		
		//Convert the above string to lowercase.
		String lowerStr = str.toLowerCase();
		String upperStr = s1.toUpperCase();
		
		//Display the two strings for comparision.
		System.out.println("Original string is: " + str);
		System.out.println("String in lowercase is: " + lowerStr);
		System.out.println("************");
		System.out.println("Original string is: " + s1);
		System.out.println("String in uppercase is: " + upperStr);
	}

}

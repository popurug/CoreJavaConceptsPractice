package com.strings;

public class StartsWithContentsofAnotherString {

	public static void main(String[] args) {

		String s1 = "Red is favourite color.";
		String s2 = "Orange is also my favourite color.";
		String s3 = "My name is Gopinath";
		String s4 = "My father's name is VenkateswaraRao";
		
		//The string to check the above two strings to see
		//if they start with this value (Red).
		String startStr = "Red";
		String startingStr = "My";
		
		//Do either of the first two strings start with startStr?
		boolean starts1 = s1.startsWith(startStr);
		boolean starts2 = s2.startsWith(startStr);
		boolean starts3 = s3.startsWith(startingStr);
		boolean starts4 = s4.startsWith(startingStr);
		
		//Display the results of the startsWith calls.
		System.out.println(s1 + " starts with " + startStr + "? " + starts1);
		System.out.println(s2 + " starts wtih " + startStr + "? " + starts2);
		System.out.println("**************");
		System.out.println(s3 + " starts with " + startingStr + "? " + starts3);
		System.out.println(s4 + " starts with " + startingStr + "? " + starts4);
	}

}

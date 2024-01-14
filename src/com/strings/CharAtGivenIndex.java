package com.strings;

public class CharAtGivenIndex {

	public static void main(String[] args) {

		String str = "Gopinath";
		System.out.println("The original string is: " + str);
		System.out.println("The given string length is: " + str.length());
		
		//The character at given index 0 and 6 are
		System.out.println("The character at 0'th index is: " + str.charAt(0));
		System.out.println("The character at 6'th index is: " + str.charAt(6));
		
		String str1 = "Maniram";
		System.out.println("***************");
		System.out.println("The original string is: " + str1);
		int len = str1.length();
		System.out.println("The length is: " + len);
		//The character at positions 0 and 5 are
		int index1 = str1.charAt(0);
		int index2 = str1.charAt(5);
		
		System.out.println("The character at position 0 is " + (char)index1);
		System.out.println("The character at position 5 is " + (char)index2);
	}

}

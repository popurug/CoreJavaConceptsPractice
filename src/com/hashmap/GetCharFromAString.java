package com.hashmap;

public class GetCharFromAString {
	
	public static char getCharFromString(String str, int index) {
		return str.charAt(index);
	}

	public static void main(String[] args) {

		String str = "Gopinath";
		String str1 = "NishanthReddy Bandala";
		int index = 2;
		char ch = getCharFromString(str, index);
		System.out.println("Character from " + str + " at index " + index + " is " + ch);
		System.out.println("The length of given string is: " + str.length());
		System.out.println("The second string length is: " + str1.length());
	}

}

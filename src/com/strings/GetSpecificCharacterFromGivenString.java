package com.strings;

public class GetSpecificCharacterFromGivenString {

	public static char getCharFromString(String str, int index) {
		return str.toCharArray()[index];
	}
	
	public static char getCharFromStringUsingJava8(String str, int index) {
		return str.chars()
				.mapToObj(ch -> (char)ch)
				.toArray(Character[] :: new)[index];
	}
	
	public static char getCharFromStringUsingCodePoint(String str, int index) {
		return (char)str.codePointAt(index);
	}
	
	public static char getCharFromStringUsingGetChars(String str, int index) {
		//Create a character array of size 1
		char[] singleCharArray = new char[1];
		
		//Get the specific character from the String
		//into the char[] at index 0
		str.getChars(index, index + 1, singleCharArray, 0);
		
		//Return the specific character
		//present at index 0 in char[]
		return singleCharArray[0];
	}

	public static void main(String[] args) {

		String str = "Gopinath";
		int index = 6;
		char ch = getCharFromString(str, index);
		System.out.println("Char from " + str + " at index " + index + " is " + ch);
		
		String str1 = "Popuru";
		int index1 = 5;
		char ch1 = getCharFromStringUsingJava8(str1, index1);
		System.out.println("Char from " + str1 + " at index " + index1 + " is " + ch1);
		
		String str2 = "Nishanth";
		int index2 = 4;
		char ch2 = getCharFromStringUsingCodePoint(str2, index2);
		System.out.println("Char from code point " + str2 + " at index " + index2 + " is " + ch2);
		
		String str3 = "ManiRam";
		int index3 = 3;
		char ch3 = getCharFromStringUsingGetChars(str3, index3);
		System.out.println("Char from get chars " + str3 + " at index " + index3 + " is " + ch3);
	}

}

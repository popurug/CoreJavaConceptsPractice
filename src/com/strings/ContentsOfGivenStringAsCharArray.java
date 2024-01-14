package com.strings;

public class ContentsOfGivenStringAsCharArray {

	public static void main(String[] args) {

		String s1 = "How are you doing today??";
		
		//Copy the contents of the String to a char array.
		//Only copy characters 4 through 10 from s1.
		//Fill the source array starting at position 2.
		char[] arr = new char[] {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		s1.getChars(4, 10, arr, 2);
		
		//Display the contents of the byte array.
		System.out.println("The char array equals \"" + arr + "\"");
	}

}

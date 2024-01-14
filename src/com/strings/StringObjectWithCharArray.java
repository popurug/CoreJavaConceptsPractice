package com.strings;

public class StringObjectWithCharArray {

	public static void main(String[] args) {

		//Character array with data.
		char[] arr_num = new char[] {'1', '2', '3', '4' };
		
		//Create a string containing the contents of arr_num
		//Starting at index 1 for length 2.
		String str = String.copyValueOf(arr_num, 1, 3);
		
		//Display the results of the new string.
		System.out.println("\n The book contains " + str +" pages.\n");
	}

}

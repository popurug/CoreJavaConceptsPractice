package com.strings;

public class CharArrayContainingContentsOfString {

	public static void main(String[] args) {

		String str = "Java Exercises.";
		String str1 = "Gopinath Popuru";
		String str2 = "Nishanth Reddy Bandala";
		String str3 = "How is the day going so far??";
		
		//Convert the above string to a char array.
		char[] arr = str.toCharArray();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		char[] arr3 = str3.toCharArray();
		
		//Display the contents of the char array.
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}

}

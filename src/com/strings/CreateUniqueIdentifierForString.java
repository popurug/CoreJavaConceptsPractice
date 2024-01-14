package com.strings;

public class CreateUniqueIdentifierForString {

	public static void main(String[] args) {

		String str = "Java Exercises.";
		String str1 = "Python Exercises.";
		String str2 = "JavaScript Exercises.";
		
		//Get the hash code for the above string.
		int hash_code = str.hashCode();
		int hash_code1 = str1.hashCode();
		int hash_code2 = str2.hashCode();
		
		//Display the hash code
		System.out.println("The hash value for " + str + " is " + hash_code);
		System.out.println("The hash value for " + str1 + " is " + hash_code1);
		System.out.println("The hash value for " + str2 + " is " + hash_code2);
	}

}

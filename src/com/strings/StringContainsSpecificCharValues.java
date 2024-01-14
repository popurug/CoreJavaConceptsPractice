package com.strings;

public class StringContainsSpecificCharValues {

	public static void main(String[] args) {

		String s1 = "Java Programs and Java certifications";
	//	String s2 = "Java";
		String s2 = "SpringBoot";
		System.out.println("The original string is: " + s1);
		System.out.println("Specified sequence of char values: " + s2);
		System.out.println(s1.contains(s2));
	}

}

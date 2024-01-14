package com.strings;

public class ReplaceSpecifiedCharacterWithAnother {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";
		String s2 = "Gopinath";
		String s3 = "Nishanth";
		String s4 = "ManiRam";
		//Replace all the 'd' characters with 'f' characters
		String new_str = str.replace('d', 'f');
		String str1 = s2.replace('p', 'l');
		String str2 = s3.replace('i', 'a');
		String str3 = s4.replace('R', 'B');
		
		//Display the strings for comparison.
		System.out.println("Original string is: " + str);
		System.out.println("New string is: " + new_str);
		System.out.println("************************");
		System.out.println("Original string is: " + s2);
		System.out.println("New string is: " + str1);
		System.out.println("*********()!!!!!!!!!!!");
		System.out.println("Original string is: " + s3);
		System.out.println("New String is: " + str2);
		System.out.println("*****()@@@@()^^^^");
		System.out.println("Original string is: " + s4);
		System.out.println("New string is: " + str3);
	}

}

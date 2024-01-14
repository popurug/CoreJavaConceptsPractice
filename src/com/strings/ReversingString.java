package com.strings;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {

	/*	String s1 = "Gopinath", revStr = "";
		char ch;
		System.out.print("Oroginal word: ");
		System.out.println("Gopinath");
		
		for(int i = 0; i<s1.length(); i++) {
			ch = s1.charAt(i);
			revStr = ch+revStr;
		}
		System.out.println("Reversed string is: " + revStr);
		
		String input = "Welcome to my java world";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println("The reversed string is: " + input1);
	//	String[] split = input.split(input);
	//	System.out.println("The string split is: " + split);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String str = s.nextLine();
		char[] arr = str.toCharArray();
		String rev = "";
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reversed string is: " + rev); */
		
		String str = "Gopi", nstr = "";
		char ch;
		System.out.print("Original string is: ");
		System.out.println("Gopi");
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reversed string is: " + nstr);
		System.out.println("The string1 lenght is: " + str.length());
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String str1 = s.nextLine();
		String rev = "";
		char ch1;
		for(int i = 0; i < str1.length(); i++) {
			ch1 = str1.charAt(i);
			rev = ch1 + rev;
		}
		System.out.println("The reversed string is: " + rev);
		System.out.println("The given string length is: " + str1.length());
	}

}

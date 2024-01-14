package com.practice;
//import java.io.*;
//import java.util.Scanner;
public class StringReverse {

/*	public static void main(String args[]) {
		String str = "Gopinath", nstr = "";
		char ch;
		
		System.out.print("Original word: ");
		System.out.println("Gopinath"); //Example word
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i); //extracts each character
			nstr = ch + nstr;  //adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);
	} */
	
/*	public static void main(String args[]) {
		String input = "GeeksforGeeks";
		
		//getBytes() method to convert string into bytes[]
		byte[] strAsByteArray = input.getBytes();
		
		byte[] result = new byte[strAsByteArray.length];
		
		//Store result in reverse order into the result byte[]
		for(int i=0; i<strAsByteArray.length; i++) {
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
			
		System.out.println(new String(result));	
		}
	} */
	
/*	public static void main(String args[]) {
		String input = "Geeks for Geeks";
		
		StringBuilder input1 = new StringBuilder();
		
		//append a string into StringBuilder input1
		input1.append(input);
		
		//reverse StringBuilder input1
		input1.reverse();
		
		//print reversed string
		System.out.println(input1);
	} */
	
	public static void main(String args[]) {
		String input = "GeeksForGeeks";
		
		//Convert String to character array by
		//using toCharArray
		char[] try1 = input.toCharArray();
		
		for(int i = try1.length-1; i>=0; i--) {
			System.out.println(try1[i]);
		}
						
	}
}


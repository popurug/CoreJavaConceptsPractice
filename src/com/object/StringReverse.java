package com.object;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		String text = s.nextLine();
		
		String revText = reverseString(text);
		System.out.println("The original string is: "+ text);
		System.out.println("The reversed string is: "+ revText);
		
		s.close();
		
	}
	
	static String reverseString(String text) {
		String[] words = text.split(" ");
		String revString = "";
		for(String word : words) {
			StringAppending sb = new StringAppending(word);
			revString = revString + sb.reverse()+" ";
		}
		return revString;
	}
}

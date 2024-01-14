package com.object;

import java.util.Scanner;

public class FirstLetterCaps {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Enter sentence here
		System.out.println("Enter sentence here: ");
		String str = s.nextLine();
		String uprCase = "";
		
		//this is for new line which is generated after conversion.
		Scanner strScan = new Scanner(str);
		while(strScan.hasNext()) {
			String word = strScan.next();
			uprCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		
		//Print original line with output.
		System.out.println("Original sentence is: " + str);
		System.out.println("Sentence after convert: " + uprCase.trim());
		
		s.close();
		strScan.close();
	}
}

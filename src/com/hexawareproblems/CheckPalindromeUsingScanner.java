package com.hexawareproblems;

import java.util.Scanner;

public class CheckPalindromeUsingScanner {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string/number to check if it is a palindrome: ");
		original = sc.nextLine();
		int len = original.length();
		
		for(int i = len-1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse))
		//	System.out.println("Entered string is a palindrome");
			System.out.println("Entered string " + original + " is a palindrome");
		else
		//	System.out.println("Entered string is not a palindrome");
			System.out.println("Entered string " + original + " is not a palindrome");
	}

}

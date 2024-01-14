package com.object;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string for checking as palindrome: ");
	    String word = s.next();
	    
	    if(isPalindrome(word))
	    	System.out.println("\""+word+"\" is a Palindrome");
	    else
	    	System.out.println("\""+word+"\" is not a Palindrome");
	    
	    s.close();
	}
	
	static boolean isPalindrome(String word) {
		int forwardIndex=0, backwardIndex=word.length()-1;
		while(forwardIndex <= backwardIndex) {
			char startChar = word.charAt(forwardIndex);
			char endChar = word.charAt(backwardIndex);
			if(startChar != endChar)
				return false;
			
			forwardIndex++;
			backwardIndex--;
		}
		return true;
	}
}

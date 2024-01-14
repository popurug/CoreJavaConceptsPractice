package com.strings;

import java.util.*;

public class FirstNonRepeatingCharInString {
	
	

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
	    System.out.println("Enter any string to validate: ");
	    String s = new String();
	    s=s1.next();
	    
	    //System.out.println();
	    System.out.println(s1);
	    

	//	String s = "aaaagopi";
		System.out.println("The given string is: " + s);
		for(int i = 0; i < s.length(); i++) {
			boolean unique = true;
			for(int j = 0; j < s.length(); j++) {
				if(i != j && s.charAt(i) == s.charAt(j)) {
					unique = false;
					break;
				}
			} 
			
			
			
			if(unique) {
				System.out.println("The first non repeated character in String is: " + s.charAt(i));
				break;
			}
		}
	
	}
	
}


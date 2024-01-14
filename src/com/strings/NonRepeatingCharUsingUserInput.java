package com.strings;

import java.util.Scanner;

public class NonRepeatingCharUsingUserInput {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any string to validate: ");
		String s = s1.nextLine();
		System.out.println(s);
		
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

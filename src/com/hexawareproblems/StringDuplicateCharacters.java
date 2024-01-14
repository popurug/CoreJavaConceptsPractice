package com.hexawareproblems;

import java.util.Scanner;

public class StringDuplicateCharacters {

	public static void main(String[] args) {

	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to find duplicate characters: ");
		String str = sc.nextLine();  */
		
		String str1 = "Communication";
		int i1 = 0, count = 0;
		
		//converts given string into character array
		char string[] = str1.toCharArray();
		
		System.out.println("Duplicate characters in a given string: ");
		
		//counts each character present in the string
		for(int i = 0; i < str1.length(); i++) {
			count = 1;
			for(int j = i+1; j <str1.length(); j++) {
				count++;
				//set string[j] to 0 to avoid printing visited character
				string[j] = '0';
			}
			
		}
		//A character is considered as duplicate if count is greater than 1
				if(count > 1 && string[i1] != '0')
					System.out.println(string[i1]);
			
	}

}


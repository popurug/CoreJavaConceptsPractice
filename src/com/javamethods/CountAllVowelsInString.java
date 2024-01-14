package com.javamethods;

import java.util.Scanner;

public class CountAllVowelsInString {
	
	public static int countVowels(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the String: ");
		String str = s.nextLine();
		System.out.println("Number of Vowels in the String are: " + countVowels(str) + "\n");
		s.close();
	}

}

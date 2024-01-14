package com.javamethods;

import java.util.Scanner;

public class CheckAllCharactersInStringAreVowelsOrNot {

	public static boolean test(String str) {
		String strVowels = "a,e,i,o,u";
		String phrase = str.toLowerCase();
		for (int i = 0; i < phrase.length(); i++) {
			if (strVowels.indexOf(phrase.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = s.nextLine();
		System.out.println("Check all characters of the said string are vowels or not!\n");
		System.out.print(test(str));
		s.close();
	}

}

package com.javamethods;

import java.util.Scanner;

public class CountAllWordsInString {
	
	public static int countWords(String str) {
		int count = 0;
		if(!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the String: ");
		String str = s.nextLine();
		System.out.println("Number of words in the string are: " + countWords(str) + "\n");
		s.close();
	}

}

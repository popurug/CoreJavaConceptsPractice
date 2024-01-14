package com.javamethods;

import java.util.Scanner;

public class DisplayMiddleCharacterOfString {

	public static String middle(String str) {
		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		return str.substring(position, position + length);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = s.nextLine();
		System.out.println("The middle character in the string is: " + middle(str) + "\n");
		s.close();
	}

}

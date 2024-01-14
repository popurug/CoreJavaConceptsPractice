package com.hashmap;

import java.util.Scanner;

public class OccurrenceOfCharsUisngCounterArray {

	public static void main(String[] args) {

		String str;
		int i, len;
		int counter[] = new int[256];
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		str = s.nextLine();
		len = str.length();
		//Loop through the string and count frequency of every character and store it in
		//counter array.
		for(i=0; i<len; i++) {
			counter[(int)str.charAt(i)]++;
		}
		//Print frequency of characters
		for(i=0; i<256; i++) {
			if(counter[i] != 0) {
				//Prints frequency of characters
				System.out.println((char) i + " --> " + counter[i]);
			}
		}
	}

}

package com.bayoneproblems;

import java.util.Scanner;

public class PenultimateWord {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String line = s.nextLine();
		String[] words = line.split("[ ]+");
		System.out.println("The Penultimate word is: " + words[words.length - 2]);
		s.close();
	}

}

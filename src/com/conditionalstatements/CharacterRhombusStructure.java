package com.conditionalstatements;

import java.util.Scanner;

public class CharacterRhombusStructure {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the number: ");
		int n = s.nextInt();
		int count = 1;
		int count2 = 1;
		char c = 'A';

		for (int i = 1; i < (n * 2); i++) {
			for (int spc = n - count2; spc > 0; spc--) {
				System.out.print(" "); // Print space
			}
			if (i < n) {
				count2++;
			} else {
				count2--;
			}
			for (int j = 0; j < count; j++) {
				System.out.print(c); // print character
				if (j < count / 2) {
					c++;
				} else {
					c--;
				}
			}
			if (i < n) {
				count = count + 2;
			} else {
				count = count - 2;
			}
			c = 'A';
			System.out.println();
		}
		s.close();
	}

}

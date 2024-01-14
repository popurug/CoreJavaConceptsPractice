package com.conditionalstatements;

import java.util.Scanner;

public class NumberRhombusStructure {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the number: ");
		int n = s.nextInt();
		int count = 1;
		int noOfSpaces = 1;
		int start = 0;

		for (int i = 1; i < (n * 2); i++) {
			for (int spc = n - noOfSpaces; spc > 0; spc--) {
				System.out.print(" ");
			}
			if (i < n) {
				start = i; // for number
				noOfSpaces++; // for spaces
			} else {
				start = n * 2 - i; // for number
				noOfSpaces--;
			}

			for (int j = 0; j < count; j++) {
				System.out.print(start);
				if (j < count / 2) {
					start--;
				} else {
					start++;
				}
			}

			if (i < n) {
				count = count + 2;
			} else {
				count = count - 2;
			}
			System.out.println();
		}
		s.close();
	}

}

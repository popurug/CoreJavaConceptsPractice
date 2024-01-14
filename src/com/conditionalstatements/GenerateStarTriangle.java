package com.conditionalstatements;

import java.util.Scanner;

public class GenerateStarTriangle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the number: ");
		int n = s.nextInt();

		for (int i = n; i > 0; i--) {
			for (int spc = n - i; spc > 0; spc--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}

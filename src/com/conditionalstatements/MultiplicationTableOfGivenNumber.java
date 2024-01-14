package com.conditionalstatements;

import java.util.Scanner;

public class MultiplicationTableOfGivenNumber {

	public static void main(String[] args) {

		int j, n;
		System.out.println("Enter the number (Table to be calculated): ");
		System.out.println("Input number of terms: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("\n");

		for (j = 0; j <= n; j++) {
			System.out.println(n + " X " + j + " = " + n * j);
		}
	//	s.close();
	}

}

package com.conditionalstatements;

import java.util.Scanner;

public class CheckNumberPositiveOrNegative {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = s.nextInt();

		if (n > 0) {
			System.out.println("The entered number is positive");
		} else if (n < 0) {
			System.out.println("The entered number is negative");
		} else {
			System.out.println("The entered number is zero");
		}
		s.close();
	}

}

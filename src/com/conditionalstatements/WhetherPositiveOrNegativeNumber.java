package com.conditionalstatements;

import java.util.Scanner;

public class WhetherPositiveOrNegativeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input Number: ");
		int input = s.nextInt();

		if (input > 0) {
			System.out.println("Number is positive");
		} else if (input < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
		s.close();
	}

}

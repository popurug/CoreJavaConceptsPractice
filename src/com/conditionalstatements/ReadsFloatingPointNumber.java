package com.conditionalstatements;

import java.util.Scanner;

public class ReadsFloatingPointNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		double n = s.nextDouble();

		if (n > 0) {
			if (n < 1) {
				System.out.println("Positive small");
			} else if (n > 1000000) {
				System.out.println("Positive large");
			} else {
				System.out.println("Positive");
			}
		} else if (n < 0) {
			if (Math.abs(n) < 1) {
				System.out.println("Negative small");
			} else if (Math.abs(n) > 1000000) {
				System.out.println("Negative large");
			} else {
				System.out.println("Negative");
			}
		} else {
			System.out.println("Zero");
		}
		s.close();
	}

}

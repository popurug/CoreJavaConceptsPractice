package com.conditionalstatements;

import java.util.Scanner;

public class PrintFloatingPointNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input value: ");
		double input = s.nextDouble();

		if (input > 0) {
			if (input < 1) {
				System.out.println("Positive small number");
			} else if (input > 1000000) {
				System.out.println("Positive large number");
			} else {
				System.out.println("Positive number");
			}
		} else if (input < 0) {
			if (Math.abs(input) < 1) {
				System.out.println("Negative small number");
			} else if (Math.abs(input) > 1000000) {
				System.out.println("Negative large number");
			} else {
				System.out.println("Negative number");
			}
		} else {
			System.out.println("Zero");
		}
		s.close();
	}

}

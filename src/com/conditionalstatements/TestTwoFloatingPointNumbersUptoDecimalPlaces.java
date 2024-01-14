package com.conditionalstatements;

import java.util.Scanner;

public class TestTwoFloatingPointNumbersUptoDecimalPlaces {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first floating point number: ");
		double x = s.nextDouble();
		System.out.println("Enter the second floating point number: ");
		double y = s.nextDouble();

		x = Math.round(x * 1000);
		x = x / 1000;

		y = Math.round(y * 1000);
		y = y / 1000;

		if (x == y) {
			System.out.println("They are the same up to three decimal places");
		} else {
			System.out.println("They are different");
		}
		s.close();
	}

}

package com.javadatatypes;

import java.util.Scanner;

public class AddsAllDigitsInTheIntegerBetweenRange {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000: ");
		int num = s.nextInt();

		int firstDigit = num % 10;
		int remainingNumber = num / 10;
		int secondDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int fourthDigit = remainingNumber % 10;
		// remainingNumber = remainingNumber / 10;
		int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
		System.out.println("The sum of all digits in " + num + " is " + sum);
		s.close();
	}

}

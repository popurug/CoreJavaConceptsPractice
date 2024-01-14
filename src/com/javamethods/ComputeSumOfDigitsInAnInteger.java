package com.javamethods;

import java.util.Scanner;

public class ComputeSumOfDigitsInAnInteger {
	
	public static int sumOfDigits(int digits) {
		int result = 0;
		while(digits > 0) {
			result += digits % 10;
			digits /= 10;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int digits = s.nextInt();
		System.out.println("The sum of digits in the given number are: " + sumOfDigits(digits));
		s.close();
	}

}

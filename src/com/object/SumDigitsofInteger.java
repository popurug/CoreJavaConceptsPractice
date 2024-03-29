package com.object;

import java.util.Scanner;

public class SumDigitsofInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		long n = s.nextLong();
		s.close();
		System.out.println("The sum of the digits is: " + sumDigits(n));
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}

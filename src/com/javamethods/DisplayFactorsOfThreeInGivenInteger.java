package com.javamethods;

import java.util.Scanner;

public class DisplayFactorsOfThreeInGivenInteger {

	public static void test(int n) {
		System.out.print(n + " = ");
		int result = n;
		while (result % 3 == 0) {
			System.out.print("3 * ");
			result = result / 3;
		}
		System.out.print(result);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer(positive/negative): ");
		int n = s.nextInt();
		System.out.println("\n Factors of 3 of the said integer:\n ");
		test(n);
		s.close();
	}

}

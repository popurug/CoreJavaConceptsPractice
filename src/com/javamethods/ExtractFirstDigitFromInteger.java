package com.javamethods;

import java.util.Scanner;

public class ExtractFirstDigitFromInteger {

	public static int test(int n) {
		int factNum = 10;
		while (n / factNum != 0) {
			factNum *= 10;
		}
		return Math.abs(n / (factNum / 10));
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer(positive/negative):");
		int n = s.nextInt();
		System.out.println("Extract the first digit from the said integer:\n");
		System.out.println(test(n));
		s.close();
	}

}

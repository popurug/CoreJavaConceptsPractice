package com.javamethods;

import java.util.Scanner;

public class CheckEveryDigitOfGivenIntegerIsEven {

	public static boolean test(int n) {
		final int f = 10;
		if (n == 0) {
			return false;
		}
		while (n != 0) {
			if ((n % f) % 2 != 0) {
				return false;
			}
			n /= 10;
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int n = s.nextInt();
		System.out.println("Check whether every digit of the said integer is even or not!!\n");
		System.out.print(test(n));
		s.close();
	}

}

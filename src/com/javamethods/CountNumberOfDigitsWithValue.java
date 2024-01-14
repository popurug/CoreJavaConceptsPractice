package com.javamethods;

import java.util.Scanner;

public class CountNumberOfDigitsWithValue {

	public static int test(int num) {
		int ctr = 0;
		int n = num;
		do {
			if (n % 10 == 2) {
				ctr++;
			}
			n /= 10;
		} while (n > 0);
		return ctr;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = s.nextInt();
		if (n > 0) {
			System.out.println(test(n));
		}
		s.close();
	}

}

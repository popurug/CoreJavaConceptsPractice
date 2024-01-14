package com.object;

import java.util.Scanner;

public class AddTwoBinaryNumbers {

	public static void main(String[] args) {
		long b1, b2;
		int i = 0, carry = 0;
		int[] sum = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first binary number: ");
		b1 = s.nextLong();

		System.out.println("Enter the second binary number: ");
		b2 = s.nextLong();
		s.close();

		while (b1 != 0 || b2 != 0) {
			sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
			carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
			b1 = b1 / 10;
			b2 = b2 / 10;
		}

		if (carry != 0) {
			sum[i++] = carry;
		}
		i--;
	//	System.out.print("Output: ");
		System.out.println("The addition of two binary numbers are: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.println("\n");
	}
}

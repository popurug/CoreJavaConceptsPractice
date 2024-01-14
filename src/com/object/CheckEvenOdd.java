package com.object;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter an integer number: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		s.close();
		// Condition to check even or odd number
		if (num % 2 == 0)
			System.out.println("Entered number is even number");
		else
			System.out.println("Entered number is odd number");

	}
}

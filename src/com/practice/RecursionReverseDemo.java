package com.practice;

import java.util.Scanner;

public class RecursionReverseDemo {

	// A method for reverse
	public static int reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return number;
		} else {
			System.out.println(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
		return number;
	}

	public static void main(String args[]) {
		int num = 0;
		System.out.println("Input your numbers and press enter: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		System.out.println("Reverse of the input number is: " + reverseMethod(num));
	//	reverseMethod(num);
	//	System.out.println();

	}
}

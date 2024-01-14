package com.object;

import java.util.Scanner;

public class AddofTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = s.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = s.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = s.nextInt();
		System.out.println("Enter the fourth number: ");
		int num4 = s.nextInt();
		System.out.println("Enter the fifth number: ");
		int num5 = s.nextInt();
		System.out.println("Enter the sixth number: ");
		int num6 = s.nextInt();
		s.close();
		int sum = num1 + num2 + num3 + num4 + num5 + num6;
		System.out.println("The sum of six numbers is: " + sum);
	}
}

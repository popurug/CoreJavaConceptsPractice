package com.object;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int num1, num2, num3, num4, sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = s.nextInt();
		System.out.println("Enter the second number: ");
		num2 = s.nextInt();
		System.out.println("Enter the third number: ");
		num3 = s.nextInt();
		System.out.println("Enter the fourth number: ");
		num4 = s.nextInt();
		s.close();
		sum = num1 + num2 + num3 + num4;
		System.out.println("The sum of four numbers is: " + sum);
	}
}

package com.conditionalstatements;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = s.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = s.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = s.nextInt();

		if (num1 > num2)
			if (num2 > num3)
				System.out.println("The greatest number is: " + num1);

		if (num2 > num1)
			if (num2 > num3)
				System.out.println("The greatest number is: " + num2);

		if (num3 > num1)
			if (num3 > num2)
				System.out.println("The greatest number is: " + num3);
		s.close();
	}

}

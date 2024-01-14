package com.javamethods;

import java.util.Scanner;

public class SmallNumberAmongThreeNumbers {

	public static double smallest(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}

	public static double largest(double x, double y, double z) {
		return Math.max(Math.max(x, y), z);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double x = s.nextDouble();
		System.out.println("Enter the second number: ");
		double y = s.nextDouble();
		System.out.println("Enter the third number: ");
		double z = s.nextDouble();
		System.out.println("The smallest number is: " + smallest(x, y, z) + "\n");
		System.out.println("The largest number is: " + largest(x, y, z) + "\n");
		s.close();
	}

}

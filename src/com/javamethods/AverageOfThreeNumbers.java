package com.javamethods;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static double average(double x, double y, double z) {
		return (x + y + z) / 3;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double x = s.nextDouble();
		System.out.println("Enter the second number: ");
		double y = s.nextDouble();
		System.out.println("Enter the third number: ");
		double z = s.nextDouble();
		System.out.println("The average value is: " + average(x, y, z) + "\n");
		s.close();
	}

}

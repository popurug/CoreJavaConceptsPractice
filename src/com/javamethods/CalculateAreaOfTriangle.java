package com.javamethods;

import java.util.Scanner;

public class CalculateAreaOfTriangle {

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
			return true;
		else
			return false;
	}

	public static double areaTriangle(double side1, double side2, double side3) {
		double area = 0;
		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter side-1 value: ");
		double side1 = s.nextDouble();
		System.out.println("Enter side-2 value: ");
		double side2 = s.nextDouble();
		System.out.println("Enter side-3 value: ");
		double side3 = s.nextDouble();
		System.out.println(isValid(side1, side2, side3) ? "The area of triangle is " + areaTriangle(side1, side2, side3)
				: "Invalid triangle");
		s.close();
	}

}

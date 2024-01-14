package com.object;

import java.util.Scanner;

public class AverageofNums {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = s.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num2 = s.nextDouble();
		
		System.out.println("Enter the third number: ");
		double num3 = s.nextDouble();
		s.close();
		System.out.println("The average of entered numbers is: " + averageOfNums(num1, num2, num3));
	}
	
	public static double averageOfNums(double a, double b, double c) {
		return (a+b+c)/3;
	}
}

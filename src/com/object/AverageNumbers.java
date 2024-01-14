package com.object;

import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double x = s.nextDouble();
		
		System.out.println("Enter the second numbre: ");
		double y = s.nextDouble();
		
		System.out.println("Enter the third number: ");
		double z = s.nextDouble();
		
		System.out.println("The average of three numbers is: " + average(x, y, z)+"\n");
		s.close();
	}
	
	public static double average(double x, double y, double z) {
		return (x + y+ z) / 3;
	}
}

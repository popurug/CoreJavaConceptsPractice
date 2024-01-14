package com.javamethods;

import java.util.Scanner;

public class CalculateAreaOfPentagon {

	public static double pentagonArea(int n, double s) {
		return (n * s * s) / (4 * Math.tan(Math.PI / n));
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the number of sides: ");
		int n = s.nextInt();
		System.out.println("Input the side: ");
		double side = s.nextDouble();
		System.out.println("The area of the pentagon is: " + pentagonArea(n, side));
		s.close();
	}

}

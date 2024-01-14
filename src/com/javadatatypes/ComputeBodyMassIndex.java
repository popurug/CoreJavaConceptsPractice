package com.javadatatypes;

import java.util.Scanner;

public class ComputeBodyMassIndex {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input weights in pounds: ");
		double weight = s.nextDouble();

		System.out.println("Input height in inches: ");
		double inches = s.nextDouble();

		double BMI = weight * 0.45359237 / ((inches * 0.0254) * (inches * 0.0254));

		System.out.println("The Body Mass Index is: " + BMI + "\n");
		s.close();
	}

}

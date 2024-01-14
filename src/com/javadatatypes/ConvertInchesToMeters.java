package com.javadatatypes;

import java.util.Scanner;

public class ConvertInchesToMeters {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a value for inch: ");
		double inch = s.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + " inch is " + meters + " meters ");
		s.close();
	}

}

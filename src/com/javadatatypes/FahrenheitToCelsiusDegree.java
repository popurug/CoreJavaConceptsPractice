package com.javadatatypes;

import java.util.Scanner;

public class FahrenheitToCelsiusDegree {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a degree in Farenheit: ");
		double farenheit = s.nextDouble();
		double celcius = ((5 * (farenheit - 32.0)) / 9.0);
		System.out.println(farenheit + " degree Farenheit is equal to " + celcius + " in Celcius");
		s.close();
	}

}

package com.object;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Give in the Celsius value: ");
		Scanner s = new Scanner(System.in);
		double celsius = s.nextDouble();
		double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
		System.out.println("Fahrenheit: "+fahrenheit);
		s.close();
	}
}

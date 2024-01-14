package com.javadatatypes;

import java.util.Scanner;

public class ConvertYearsIntoMinutesAndDays {

	public static void main(String[] args) {

		double minutesInYear = 60 * 24 * 365;
		Scanner s = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		double minutes = s.nextDouble();
		long years = (long) (minutes / minutesInYear);
		int days = (int) (minutes / 60 / 24) % 365;
		System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days ");
		s.close();
	}

}

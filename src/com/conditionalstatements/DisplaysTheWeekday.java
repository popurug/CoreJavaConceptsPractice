package com.conditionalstatements;

import java.util.Scanner;

public class DisplaysTheWeekday {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int day = s.nextInt();

		System.out.println(getDayName(day));
		s.close();
	}

	// Get the name for the week
	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day range";
		}
		return dayName;
	}

}

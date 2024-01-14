package com.conditionalstatements;

import java.util.Scanner;

public class FindNumberOfDaysInMonth {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numberOfDaysInMonth = 0;
		String MonthOfName = "Unknown";

		System.out.println("Enter the month number: ");
		int month = s.nextInt();

		System.out.println("Enter the year: ");
		int year = s.nextInt();

		switch (month) {
		case 1:
			MonthOfName = "January";
			numberOfDaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numberOfDaysInMonth = 29;
			} else {
				numberOfDaysInMonth = 28;
			}
			break;
		case 3:
			MonthOfName = "March";
			numberOfDaysInMonth = 31;
			break;
		case 4:
			MonthOfName = "April";
			numberOfDaysInMonth = 30;
			break;
		case 5:
			MonthOfName = "May";
			numberOfDaysInMonth = 31;
			break;
		case 6:
			MonthOfName = "June";
			numberOfDaysInMonth = 30;
			break;
		case 7:
			MonthOfName = "July";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "August";
			numberOfDaysInMonth = 31;
			break;
		case 9:
			MonthOfName = "September";
			numberOfDaysInMonth = 30;
			break;
		case 10:
			MonthOfName = "October";
			numberOfDaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "November";
			numberOfDaysInMonth = 30;
			break;
		case 12:
			MonthOfName = "October";
			numberOfDaysInMonth = 31;
			break;
		}
		System.out.println(MonthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
	}

}

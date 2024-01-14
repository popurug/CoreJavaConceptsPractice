package com.javamethods;

import java.util.Scanner;

public class CheckWhetherYearIsLeapYearOrNot {

	public static boolean isLeapYear(int y) {
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = ((y % 100 == 0) && (y % 400 == 0));
		return a && (b || c);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a year: ");
		int year = s.nextInt();
		System.out.println(isLeapYear(year));
		s.close();
	}

}

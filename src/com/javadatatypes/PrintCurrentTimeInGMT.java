package com.javadatatypes;

import java.util.Scanner;

public class PrintCurrentTimeInGMT {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the time zone offset to GMT: ");
		long timeZoneChange = s.nextInt();
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes / 60;
		long totalHours = totalMinutes / 60;
		long currentHour = ((totalHours + timeZoneChange) % 24);
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
		s.close();
	}

}

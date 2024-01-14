package com.javaenumtypes;

public class DaysInAWeek {

	public enum DaysOfWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {

		DaysOfWeek today = DaysOfWeek.WEDNESDAY;
		System.out.println("Today is: " + today);
	}

}

package com.bayoneproblems;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTime {

	public static void main(String[] args) {
	/*	LocalDate currentDate =  LocalDate.now();
		System.out.println("LocalDate is: " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("LocalTime is: " + currentTime); */
		
	/*	Clock c1 = Clock.systemUTC();
		LocalDate cd = LocalDate.now(c1);
		System.out.println("LocalDate is: " + cd);
		System.out.println("*************()$$$$$$$$$$$$"); */
		
		ZoneId zid = ZoneId.of("Europe/Paris");
		LocalDate cd1 =  LocalDate.now(zid);
		System.out.println("LocalDate is: " + cd1);

	}

}

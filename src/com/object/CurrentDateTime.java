package com.object;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
	//	System.out.println("The current date and time is: " + current);
	//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	//	String formatted = current.format(formatter);
		
	//	System.out.println("The current date and time is: " + formatted);
		
	//	DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
	//	String formatted = current.format(formatter);
		
	//	System.out.println("The current date is: " + formatted);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted = current.format(formatter);
		
		System.out.println("Current Date is: " + formatted);
	}
}
	
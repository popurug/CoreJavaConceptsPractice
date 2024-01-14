package com.object;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1994, 07, 07);
		int years = Period.between(birthDate, today).getYears();
		
		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
	}
}

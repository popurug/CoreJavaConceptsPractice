package com.javadatatypes;

import java.util.Scanner;

public class CalculateSpeedInMetersPerSeconds {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		float timeSeconds;
		float mps, kph, mph;
		System.out.println("Input distance in meters: ");
		float distance = s.nextFloat();
		
		System.out.println("Input hour: ");
		float hr = s.nextFloat();
		
		System.out.println("Input minutes: ");
		float min = s.nextFloat();
		
		System.out.println("Input seconds: ");
		float sec = s.nextFloat();
		
		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance/timeSeconds;
		kph = (distance/1000.0f)/(timeSeconds/3600.0f);
		mph = kph/1.609f;
		
		System.out.println("Your speed in meters/second is: " + mps);
		System.out.println("Your speed in km/h is: " + kph);
		System.out.println("Your speed in miles/h: " + mph);
		
		s.close();
	}

}

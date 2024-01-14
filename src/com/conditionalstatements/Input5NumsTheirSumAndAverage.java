package com.conditionalstatements;

import java.util.Scanner;

public class Input5NumsTheirSumAndAverage {

	public static void main(String[] args) {

		int i, n = 0, s = 0;
		double avg;
		
			System.out.println("Input the 5 numbers: ");
		
		Scanner s1 = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			
			n = s1.nextInt();
			s += n;
			
		}
		s1.close();
		avg = s / 5;
		System.out.println("The sum of 5 no's is: " + s + "\n The average is: " + avg);
	}

}

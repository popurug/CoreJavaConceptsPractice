package com.practice;

import java.util.Scanner;

public class UserInputSum {

	public static void main(String args[]) {
		Double number, sum = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a input number: ");
			
			//Takes the double input from the user
			number = input.nextDouble();
			
			//if number is negative the loop terminates
			if(number < 0.0) {
				break;
			}
			sum = sum + number;
		}
		System.out.println("The sum of all numbers entered by the user = " + sum);
	}
}

package com.object;

import java.util.Scanner;

public class DemoSummation {
 
	public static void main(String[] args) {
		
		/*
		 * int input = 20; int finalResult = summation(input);
		 * System.out.println(finalResult);
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		 int res = s.nextInt();
		int finalResult = summation(res);
		System.out.println(finalResult);
		System.out.println("The summation of the given number is: " + finalResult);
		
	}
	
	public static int summation(int n) {
		int result = (n * (n+1)) / 2;
		return result;
	}
}

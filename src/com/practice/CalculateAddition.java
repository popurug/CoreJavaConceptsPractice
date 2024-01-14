package com.practice;

import java.util.Scanner;

public class CalculateAddition {
	static int a = 10;
	static int b = 20;
	static int c = a + b;

	public static void main(String args[]) {
	//	System.out.println(c);
	
	/*
	 * int num1=15, num2=30, sum; sum = num1 + num2;
	 * System.out.println("Sum of two numbers: " + sum);
	 */
	 
	/*	int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		
		sc.close();
		sum = num1 + num2;
		System.out.println("Sum of these numbers: " + sum);  */
		
		float num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = sc.nextFloat();
		
		System.out.println("Enter the second number: ");
		num2 = sc.nextFloat();
		
		sc.close();
		sum = num1 + num2;
		System.out.println("Sum of two float numbers: " + sum);
	}
}

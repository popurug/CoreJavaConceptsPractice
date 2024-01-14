package com.object;

import java.util.Scanner;

public class TernaryOperator {
 
	public static void main(String[] args) {
		int num1, num2, num3, result, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = s.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = s.nextInt();
		
		System.out.println("Enter the third number: ");
		num3 = s.nextInt();
		s.close();
		
		temp = num1 < num2 ? num1:num2;
		result = num3 < temp ? num3:temp;
		System.out.println("The smallest number is: " + result);
	}
}

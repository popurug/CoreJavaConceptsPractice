package com.object;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = s.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = s.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = s.nextInt();
		int finalResult = (num1 * num2 * num3);
		System.out.println("The final multiplication result is: "+ finalResult);
		s.close();
	}
}

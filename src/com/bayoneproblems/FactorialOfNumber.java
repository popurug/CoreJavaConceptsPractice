package com.bayoneproblems;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public int factorialNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		int i, fact = 1;
		for(i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.println(i);
			System.out.println("********");
			System.out.println(fact);
		}
		System.out.println("The factorial of the given number is: " + fact);
		return num;
	}

	public static void main(String[] args) {

	/*	int i, fact = 1;
		int number = 6;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of number " +number + " is: " +fact);  */
		
		FactorialOfNumber fn = new FactorialOfNumber();
		fn.factorialNumber();
	}

}

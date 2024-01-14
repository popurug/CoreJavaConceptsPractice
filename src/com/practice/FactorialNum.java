package com.practice;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		int n = 100, t1 = 0, t2 = 1;
		System.out.println("Upto" + n + ": ");
		
		while(t1 <= n) {
			System.out.println(t1 + " + ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter the number: ");
		 * int num = s.nextInt(); int factorial = fact(num);
		 * System.out.println("Factorial of entered number is: " + factorial);
		 */
	}
	
	
	/*
	 * static int fact(int n) { int output; if (n == 1) { return 1; } output =
	 * fact(n - 1) * n; return output; }
	 */
	 
}

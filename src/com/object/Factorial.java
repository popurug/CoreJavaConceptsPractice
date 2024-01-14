package com.object;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Which number's factorial: ");
		int num = s.nextInt();
		
		Factorial f = new Factorial();
		int fact = f.factorial(num);
		
		System.out.println("Factorial of "+num+" = "+fact);
		
		s.close();
	}
	
	int factorial(int n) {
		int fact = 1;
		for(int seq=1; seq<=n; seq++) {
		//	fact *= seq;
			fact = fact * seq;
		}
		return fact;
	}
}

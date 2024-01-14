package com.javarecursivemethods;

public class GreatestCommonDivisor {

	public static int calculateGCD(int num1, int num2) {
		// Base case: If the second number is 0, the GCD is the first number
		if (num2 == 0) {
			return num1;
		}

		// Recursive case: Calculate the GCD by recursively calling the method with num2
		// as the new
		// num1 and the remainder as num2
		int remainder = num1 % num2;
		return calculateGCD(num2, remainder);
	}

	public static void main(String[] args) {

		int n1 = 16;
		int n2 = 18;
		int gcd = calculateGCD(n1, n2);
		System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);
	}

}

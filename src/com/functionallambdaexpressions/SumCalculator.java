package com.functionallambdaexpressions;

@FunctionalInterface
public interface SumCalculator {
	int sum(int a, int b);
	
	public static void substract(int a, int b) {
		System.out.println("The substraction of two numbers is: ");
	}

}

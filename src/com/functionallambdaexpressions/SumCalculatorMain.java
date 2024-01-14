package com.functionallambdaexpressions;

public class SumCalculatorMain {

	public static void main(String[] args) {

		SumCalculator sumCalculator = (x, y) -> x + y;
		SumCalculator subtractCalculator = (x, y) -> x * y;
		int result = sumCalculator.sum(7, 6);
		System.out.println("Sum of (7,6) is: " + result);

		result = sumCalculator.sum(15, 20);
		System.out.println("Sum of (15, 20) is: " + result);
		
		System.out.println("****************");
		
		int result1 = subtractCalculator.sum(12, 13);
		System.out.println("Multiplication of (12,13) is: " + result1);
	}

}

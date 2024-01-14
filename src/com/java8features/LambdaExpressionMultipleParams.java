package com.java8features;

public class LambdaExpressionMultipleParams {

	public static void main(String[] args) {

		Addable a1 = (a,b) -> (a + b);
		System.out.println(a1.add(30, 40));
		
		//Multiple parameters with data type in lambda expression
		Addable a2 = (int a, int b) -> (a + b);
		System.out.println(a2.add(100, 500));
	}

}

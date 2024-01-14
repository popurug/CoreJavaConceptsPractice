package com.lambda;

@FunctionalInterface
interface Product{
	double Mul(double x, double y);
}

public class LambdaMultipleParameters {

	public static void main(String[] args) {
		
		Product Mul1 = (x,y) -> (x*y);
		System.out.println(Mul1.Mul(2, 5));
		
		Product Mul2 = (double x, double y) -> (x*y);
		System.out.println(Mul2.Mul(100, 200));
	}
}

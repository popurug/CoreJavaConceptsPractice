package com.java8features;

public class JavaLambdaExpression {

	public static void main(String[] args) {

		int width = 10;
		
		//with lambda
		Drawable1 d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
		d2.length();
		Drawable1.size();
		Drawable1.mapping();
		d2.usingScanner();
		d2.methodParameters(26, 35);
	}

}

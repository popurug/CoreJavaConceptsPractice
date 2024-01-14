package com.java8features;

public class LambdaExpressionNoParams {

	public static void main(String[] args) {

		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}

}

package com.java8features;

public class JavaLambdaExpressionSingleParams {

	public static void main(String[] args) {

		Doable d = (name) -> {
			return "How are you doing?? " + name;
		};
		System.out.println(d.say("Gopinath!!"));
		
		//You can omit the function parenthesis
		Doable d1 = name -> {
			return "Welcome to my java world!!! " + name;
		};
		System.out.println(d1.say("Nishanth!$"));
	}

}

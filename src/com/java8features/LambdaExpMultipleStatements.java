package com.java8features;

public class LambdaExpMultipleStatements {

	public static void main(String[] args) {

		Sayable1 person = (message) -> {
			String s1 = "I would like to say: ";
			String s2 = s1 + message;
			return s2;
		};
		System.out.println("The message is: " + person.say("time is precious."));
	}

}

package com.hexawareproblems;

public class FunctionalInterfaceExample implements Sayable {

	public static void main(String[] args) {

		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello there!! Welcome to my java world");
		
		FunctionalInterfaceExample fie1 = new FunctionalInterfaceExample();
		fie1.say("This is my first functional interface example: ");
	}

	@Override
	public void say(String msg) {

		System.out.println(msg);
	}

}

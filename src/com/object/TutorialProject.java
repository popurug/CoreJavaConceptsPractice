package com.object;

import java.util.Scanner;

public class TutorialProject {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		inputTest();
		
		countNumbers();
		
		compareUnequalString();
	}
	
	public static void inputTest() {
		String message = input.nextLine();
		System.out.println(Hello(message));
	}
	
	public static String Hello(String message) {
		if(message.equals("Hi")) {
			return "Hello";
		}else {
			return "Goodbye";
		}
	}
	
	public static void countNumbers() {
		int i = 0;
		while(i <= 100) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void compareUnequalString() {
		String x = "Brandon";
		String y = "Ryan";
		if(!x.equals(y)) {
			System.out.println("x does not equal to y.");
			if(2 != 6) {
				System.out.println("2 does not equal to 6.");
			}
		}
	}
}

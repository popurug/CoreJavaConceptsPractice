package com.object;

public class JavaFact {

	public static void main(String[] args) {
		int i, fact = 1;
		int number = 6;
		for(i=1; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of "+number+ " is: "+fact);
	}
}

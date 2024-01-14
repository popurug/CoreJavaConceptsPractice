package com.exceptions;

public class ArithmeticException {

	public static void main(String[] args) throws Exception {
		
	int n1,n2,n3;
	try {
		n1 = 100;
		n2 = 0;
		n3 = n1/n2;
		System.out.println(n3);
	} catch(Exception e) {
		System.out.println("The divider cannot be zero, try a different number.");
	}
}
}

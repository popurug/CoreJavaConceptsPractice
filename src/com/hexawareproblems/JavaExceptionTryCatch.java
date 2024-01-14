package com.hexawareproblems;

public class JavaExceptionTryCatch {

	public static void main(String[] args) {

		try {
			//code that may raise exception
			int data = 100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		//remaining lines of code
		System.out.println("rest of the code....");
	}

}

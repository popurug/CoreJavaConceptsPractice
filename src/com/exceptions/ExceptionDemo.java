package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		try {
			int a = 250, b = 0;
			int c = a/b;
			System.out.println("Result is: " + c);
		}catch (ArithmeticException e) {
			System.out.println("Exception is " + e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is " + e);
		}catch (Exception e) {
			System.out.println("Exception is " + e);
		}finally {
			System.out.println("In the finally block.....");
		}
	}
}

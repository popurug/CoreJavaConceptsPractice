package com.finallyblock;

public class ExceptionOccurNotHandledByCatchBlock {

	public static void main(String[] args) {

		try {
			System.out.println("Inside the try block");
			
			//below code shows divide by zero exception
			int data = 25/5;
			System.out.println(data);
		 //can not handle Arithmetic type exception
		//can only accept Null Pointer type exception
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		//executes regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code..!!!");
	}

}

package com.practice;

public class TestCallRun extends Thread {

	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public int multiply() {
		int a=10,b=10,c;
	     c=a*b;
		System.out.println("The value of the variable c is: " + c);
		return c;
	}
	
	public int division() {
		int a=10, b=0, c = 0;
		try {
			c=a/b;
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		return c;
	}
	
	private int forLoop() {
	/*	for(int i=0; i<=20; i--) {
			System.out.println(i);
		} */
		String i = null;
		System.out.println("The value of the i: " + i);
		return 0;
	}
	
	public static void main(String args[]) {
		TestCallRun t1 = new TestCallRun();
		TestCallRun t2 = new TestCallRun();
		System.out.println("Welcome to my first Java Program");
		int a=10,b=20,c;
		c=a+b;
		System.out.println("The value of the variable c is: " + c);
		
		for(int i=1; i<=20; i--) {
			System.out.println(i);
		}
		
		t1.forLoop();
		t1.multiply();
		t1.division();
		t1.run();
		t2.run();
		
	}
}

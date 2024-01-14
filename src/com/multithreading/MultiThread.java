package com.multithreading;

public class MultiThread extends Thread {

	public void run() {
		System.out.println("Thread Operational");
	}
	
	public static void main(String[] args) {
		MultiThread Thread_a = new MultiThread();
		MultiThread Thread_b = new MultiThread();
		MultiThread Thread_c = new MultiThread();
		
		Thread_a.start();
		Thread_b.start();
		Thread_c.start();
 	}
}

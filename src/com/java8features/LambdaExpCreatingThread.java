package com.java8features;

public class LambdaExpCreatingThread {

	public static void main(String[] args) {

		//Thread example without lambda
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Thread1 is running....");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//Thread example with lambda
		Runnable r2 = () -> {
			System.out.println("Thread2 is running..!!!");
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}

}

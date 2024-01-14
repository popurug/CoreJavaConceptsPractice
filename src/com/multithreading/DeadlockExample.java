package com.multithreading;

public class DeadlockExample {

	public static void main(String[] args) {

		Object resource1 = new Object();
		Object resource2 = new Object();
		
		Thread t1 = new Thread(()-> {
			synchronized (resource1) {
				System.out.println("Thread1 acquired Resource 1");
				try {
					Thread.sleep(100);
					synchronized (resource2) {
						System.out.println("Thread1 needs Resource 2 (deadlock!)");
					}
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()-> {
			synchronized (resource2) {
				System.out.println("Thread2 acquired Resource 2");
				try {
					Thread.sleep(100); //Simulate delay
					synchronized (resource1) {
						System.out.println("Thread2 needs Resource 1 (deadlock!)");
					}
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		//Both threads will struck in deadlock indefinitely.
	}

}

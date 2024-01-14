package com.multithreading;

class Hi extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hi, Welcome to my program");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		System.out.println("Line Break-------------------------");
	}
}

class Hello extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hello, Welcome to my java world");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		System.out.println("Line Break for Hello method--------------------");
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
          Hi obj1 = new Hi();
          Hello obj2 = new Hello();
          
          obj1.start();
          obj2.start();
	}

}

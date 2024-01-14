package com.multithreading;

public class PrintHelloWorldThread extends Thread {

	public void run() {
		System.out.println("Hello, World!!");
	}

	public static void main(String[] args) {

		PrintHelloWorldThread t = new PrintHelloWorldThread();
		t.start();
		t.run();
	}

}

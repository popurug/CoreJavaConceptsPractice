package com.multithreading;

public class FindEvenOddNumberThreads {
	private static final int maxNumber = 20;
	private static Object lock = new Object();
	private static boolean isEvenTurn = true;

	public static void main(String[] args) {

		Thread evenThread = new Thread(() -> {
			for (int i = 2; i <= maxNumber; i += 2) {
				synchronized (lock) {
					while (!isEvenTurn) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Even Number from evenThread is: " + i);
					isEvenTurn = false;
					lock.notify();
				}
			}
		});

		Thread oddThread = new Thread(() -> {
			for (int i = 1; i <= maxNumber; i += 2) {
				synchronized (lock) {
					while (isEvenTurn) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Odd Number from oddThread is: " + i);
					isEvenTurn = true;
					lock.notify();
				}
			}

		});

		evenThread.start();
		oddThread.start();
	}

}

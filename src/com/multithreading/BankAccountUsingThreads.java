package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountUsingThreads {
	private double balance;
	private Lock lock;

	public BankAccountUsingThreads() {
		balance = 0.0;
		lock = new ReentrantLock();
	}

	public void deposit(double amount) {
		lock.lock();
		try {
			balance = balance + amount;
			System.out.println("Deposit: " + amount);
			System.out.println("Balance after deposit: " + balance);
		} finally {
			lock.unlock();
		}
	}

	public void withdraw(double amount) {
		lock.lock();
		try {
			if (balance >= amount) {
				balance = balance - amount;
				System.out.println("Withdrawal: " + amount);
				System.out.println("New Balance after withdrawal: " + balance);
			} else {
				System.out.println("Try to withdraw: " + amount);
				System.out.println("Insufficient funds, Withdrawal cancelled.");
			}
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {

		BankAccountUsingThreads account = new BankAccountUsingThreads();

		Thread depositThread1 = new Thread(() -> account.deposit(1000.0));
		Thread depositThread2 = new Thread(() -> account.deposit(300.0));
		Thread withdrawalThread1 = new Thread(() -> account.withdraw(150.0));
		Thread withdrawalThread2 = new Thread(() -> account.withdraw(1200.0));

		depositThread1.start();
		withdrawalThread1.start();
		depositThread2.start();
		withdrawalThread2.start();
	}

}

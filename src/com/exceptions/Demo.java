package com.exceptions;

import java.io.IOException;

class Banking {
	int balance = 10000;
	void withdraw(int amt) throws IOException {
		int diff = balance - amt;
		if(diff < 5000) {
			IOException io = new IOException("Low");
			throw io;
			
	//		NullPointerException ne = new NullPointerException(); // unchecked exception
	//		throw ne;
	//		System.out.println("Balance is low");
		} else {
			balance = balance - amt;
			System.out.println("Amount left: " + balance);
		}
	}
	
}
public class Demo {

	public static void main(String[] args) {
		System.out.println("Banking has started");
		Banking b = new Banking();
		try {
			b.withdraw(2000);
			b.withdraw(2000);
			b.withdraw(3000);
		} catch (Exception e) {
			System.out.println("Exception for banking: " + e);
		}
		System.out.println("Banking has Ended");
	}
}

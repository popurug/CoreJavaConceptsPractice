package com.encapsulation;

public class BankAccountEncapsulation {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();

		// Set values using setter methods
		ba.setName("Gopinath Popuru");
		ba.setAccountNumber("SBI-123143884");
		ba.setBalance(6000.0);

		// Get values using getter methods
		String name = ba.getName();
		String accountNumber = ba.getAccountNumber();
		double balance = ba.getBalance();

		// Print the values
		System.out.println("Name of bank holder is: " + name);
		System.out.println("Account number of bank holder is: " + accountNumber);
		System.out.println("Available balance in the account is: " + balance);
	}

}

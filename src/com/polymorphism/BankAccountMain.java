package com.polymorphism;

public class BankAccountMain {

	public static void withdrawFromAccount(BankAccount account, double amount) {
		account.withdraw(amount);
	}

	public static void main(String[] args) {

		BankAccount savingsAccount = new SavingsAccount(2000, 650);
		BankAccount checkingAccount = new CheckingAccount(1000, 100);

		withdrawFromAccount(savingsAccount, 300);
		withdrawFromAccount(checkingAccount, 250);

		System.out.println("Savings Account balance is: " + savingsAccount.getBalance());
		System.out.println("Checking Account balance is: " + checkingAccount.getBalance());
	}

}

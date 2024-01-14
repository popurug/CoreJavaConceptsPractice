package com.polymorphism;

public class SavingsAccount extends BankAccount {
	private double withdrawalLimit;

	public SavingsAccount(double initialBalance, double withdrawalLimit) {
		super(initialBalance);
		this.withdrawalLimit = withdrawalLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= withdrawalLimit) {
			super.withdraw(amount);
		} else {
			System.out.println("Withdrawal limit exceeded: ");
		}
	}

}

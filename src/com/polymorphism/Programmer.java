package com.polymorphism;

public class Programmer extends Employee {
	private double baseSalary;
	private double overTimePay;

	public Programmer(String name, double baseSalary, double overTimePay) {
		super(name, "Programmer");
		this.baseSalary = baseSalary;
		this.overTimePay = overTimePay;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + overTimePay;
	}

}

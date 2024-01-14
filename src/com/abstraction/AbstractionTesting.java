package com.abstraction;

public class AbstractionTesting {

	public static void main(String[] args) {

		Employment contractor = new Contractor("Gopinath Popuru", 10, 10);
		Employment fullTimeEmployee = new FullTimeEmployee("Nishanth Bandala", 8);
		System.out.println(contractor.calculateSalary());
		System.out.println(fullTimeEmployee.calculateSalary());
	}

}

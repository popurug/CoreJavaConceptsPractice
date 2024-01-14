package com.polymorphism;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Manager("Gopinath Popuru", 7500.0, 1500.0);
		Employee e2 = new Programmer("Nishanth Bandala", 5000.0, 600.0);
		
		System.out.println("Manager: " + e1.getName() + "\n Role: " + e1.getRole() + 
				"\n Salary: $" + e1.calculateSalary());
		System.out.println("\n Programmer: " + e2.getName() + "\n Role: " + e2.getRole() +
				"\n Salary: $" + e2.calculateSalary());
	}

}

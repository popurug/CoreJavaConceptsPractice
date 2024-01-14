package com.encapsulation;

public class EmployeeEncapsulation {

	public static void main(String[] args) {

		EmployeeInformation ei = new EmployeeInformation();

		// Set values using setter methods
		ei.setEmployeeName("Nishanth Bandala");
		ei.setEmployeeId(884);
		ei.setEmployeeSalary(6800.0);

		// Get values using getter methods
		String employeeName = ei.getEmployeeName();
		int employeeId = ei.getEmployeeId();
		double employeeSalary = ei.getEmployeeSalary();

		// Print the values
		System.out.println("Employee Details are: ");
		System.out.println("Employee name is: " + employeeName);
		System.out.println("Employee id is: " + employeeId);
		System.out.println("Employee salary is: " + employeeSalary);

	}

}

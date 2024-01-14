package com.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(6);
		e.setName("Gopinath Popuru");
		e.setSalary(45000);
		
		System.out.println("Name: " + e.getName());
		System.out.println("Id: " + e.getId());
		System.out.println("Salary: " + e.getSalary());
	}
}

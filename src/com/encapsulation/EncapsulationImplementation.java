package com.encapsulation;

public class EncapsulationImplementation {

	public static void main(String[] args) {

		Person pr = new Person();

		pr.setName("Gopinath Popuru");
		pr.setAge(25);
		pr.setCountry("United States");

		// Get values using getter methods
		String name = pr.getName();
		int age = pr.getAge();
		String country = pr.getCountry();

		// Print the values
		System.out.println("Name of person is: " + name);
		System.out.println("Age of person is: " + age);
		System.out.println("Country of person is: " + country);
	}

}

package com.encapsulation;

public class CarEncapsulation {

	public static void main(String[] args) {

		Car car = new Car();

		// Set the values using the setter methods
		car.setCompanyName("Chevrolet");
		car.setModelName("Cruze");
		car.setYear(2009);

		// Get the values using the getter methods
		String companyName = car.getCompanyName();
		String modelName = car.getModelName();
		int year = car.getYear();
		double mileage = car.getMileage();

		// Print the values
		System.out.println("Company Name is: " + companyName);
		System.out.println("Model name is: " + modelName);
		System.out.println("Year is: " + year);
		System.out.println("Mileage is: " + mileage);
	}

}

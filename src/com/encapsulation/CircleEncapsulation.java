package com.encapsulation;

public class CircleEncapsulation {

	public static void main(String[] args) {

		Circle cr = new Circle();

		// Set the radius using the setter method
		cr.setRadius(6.0);

		// Get the radius using the getter method
		double radius = cr.getRaadius();

		// Calculate and print the area and perimeter
		double area = cr.calculateArea();
		double perimeter = cr.calculatePerimeter();

		System.out.println("Circle Radius is: " + radius);
		System.out.println("Circle area is: " + area);
		System.out.println("Circle perimeter is: " + perimeter);

	}

}

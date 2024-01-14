package com.encapsulation;

public class RectangleEncapsulation {

	public static void main(String[] args) {

		Rectangle re = new Rectangle();

		// Set values using setter methods
		re.setLength(6.7);
		re.setWidth(12.6);

		// Get values using getter methods
		double length = re.getLength();
		double width = re.getWidth();

		// Print the values
		System.out.println("The lenght of rectangle is: " + length);
		System.out.println("The width of rectangle is: " + width);
	}

}

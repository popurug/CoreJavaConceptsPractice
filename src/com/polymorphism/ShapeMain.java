package com.polymorphism;

public class ShapeMain {

	public static void main(String[] args) {

		Circle circle = new Circle(4);
		System.out.println("The area of circle is: " + circle.calculateArea());

		Rectangle rectangle = new Rectangle(12, 34);
		System.out.println("\n The area of rectangle is: " + rectangle.calculateArea());

		Triangle triangle = new Triangle(5, 9);
		System.out.println("\n The area of triangle is: " + triangle.calculateArea());
	}

}

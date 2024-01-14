package com.encapsulation;

public class Circle {
	private double radius;

	public double getRaadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

}

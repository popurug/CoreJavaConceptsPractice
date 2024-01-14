package com.polymorphism;

public class CircleDemo extends Shaping {
	private double radius;

	public CircleDemo(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}

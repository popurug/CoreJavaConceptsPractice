package com.polymorphism;

public class CircleShaped extends Shaped {
	private double radius;

	public CircleShaped(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle...");
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}

package com.polymorphism;

public class CircleActions extends ShapedActions {
	private double radius;

	public CircleActions(double radius) {
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

	protected double getRadius() {
		return radius;
	}

}

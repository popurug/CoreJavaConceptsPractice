package com.polymorphism;

public class CylinderActions extends CircleActions {
	private double height;

	public CylinderActions(double radius, double height) {
		super(radius);
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a cylinder...");
	}

	@Override
	public double calculateArea() {
		// Calculate the total surface area of cylinder (including the circular top and
		// bottom)
		double circleArea = super.calculateArea();
		double sideArea = 2 * Math.PI * getRadius() * height;
		return 2 * circleArea + sideArea;
	}

}

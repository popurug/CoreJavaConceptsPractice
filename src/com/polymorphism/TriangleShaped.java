package com.polymorphism;

public class TriangleShaped extends Shaped {
	private double base;
	private double height;

	public TriangleShaped(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle...");
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

}

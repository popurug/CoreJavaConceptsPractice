package com.polymorphism;

public class RectangleDemo extends Shaping {
	private double length;
	private double width;

	public RectangleDemo(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

}

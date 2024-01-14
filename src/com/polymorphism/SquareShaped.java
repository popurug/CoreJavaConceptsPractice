package com.polymorphism;

public class SquareShaped extends Shaped {
	private double side;

	public SquareShaped(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square...");
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

}

package com.polymorphism;

public class ShapedMain {

	public static void drawShapeAndCalculateArea(Shaped shaped) {
		shaped.draw();
		double area = shaped.calculateArea();
		System.out.println("Area is: " + area);

	}

	public static void main(String[] args) {

		Shaped circle = new CircleShaped(7.0);
		Shaped square = new SquareShaped(12.0);
		Shaped triangle = new TriangleShaped(5.0, 3.0);

		drawShapeAndCalculateArea(circle);
		drawShapeAndCalculateArea(square);
		drawShapeAndCalculateArea(triangle);

	}

}

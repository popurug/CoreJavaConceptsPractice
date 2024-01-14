package com.javaenumtypes;

public class GeometricShapes {

	public enum Shape {
		SQUARE, CIRCLE, RECTANGLE, TRIANGLE, HEXAGON
	}

	public static void main(String[] args) {

		Shape s1 = Shape.CIRCLE;
		Shape s2 = Shape.SQUARE;
		Shape s3 = Shape.RECTANGLE;
		Shape s4 = Shape.TRIANGLE;
		Shape s5 = Shape.HEXAGON;

		System.out.println("First shape is: " + s1);
		System.out.println("Second shape is: " + s2);
		System.out.println("Third shape is: " + s3);
		System.out.println("Fourth shape is: " + s4);
		System.out.println("Fifth shape is: " + s5);
	}

}

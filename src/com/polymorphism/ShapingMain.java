package com.polymorphism;

public class ShapingMain {

	public static void main(String[] args) {

		double r = 4.0;
		CircleDemo circleDemo = new CircleDemo(r);

		double rs1 = 4.0, rs2 = 6.0;
		RectangleDemo rectangleDemo = new RectangleDemo(rs1, rs2);

		double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
		TriangleDemo triangleDemo = new TriangleDemo(ts1, ts2, ts3);

		System.out.println("Radius of the circle is: " + r);
		System.out.println("Area of the circle is: " + circleDemo.getArea());
		System.out.println("Perimeter of the circle is: " + circleDemo.getPerimeter());

		System.out.println("\n Sides of the rectangle are: " + rs1 + ','+ rs2);
		System.out.println("Area of the rectangle is: " + rectangleDemo.getArea());
		System.out.println("Perimeter of the rectangle is: " + rectangleDemo.getPerimeter());

		System.out.println("\n Sides of the triangle are: " + ts1 + ',' + ts2 + ',' + ts3);
		System.out.println("Area of the triangle is: " + triangleDemo.getArea());
		System.out.println("Perimeter of the triangle is: " + triangleDemo.getPerimeter());
	}

}

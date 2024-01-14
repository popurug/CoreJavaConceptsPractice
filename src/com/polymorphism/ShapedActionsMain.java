package com.polymorphism;

public class ShapedActionsMain {

	public static void drawShapeAndCalculateArea(ShapedActions shape) {
		shape.draw();
		double area = shape.calculateArea();
		System.out.println("The Area is: " + area);
	}

	public static void main(String[] args) {

		CircleActions shapedActions = new CircleActions(7.0);
		CylinderActions cylinderActions = new CylinderActions(4.0, 9.0);

		drawShapeAndCalculateArea(shapedActions);
		drawShapeAndCalculateArea(cylinderActions);

	}

}

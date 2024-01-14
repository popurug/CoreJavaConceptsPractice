package com.java_interface;

import java.util.Scanner;

public class ShapeArea implements Area, Area_Calculation  {

	@Override
	public void Square() {
	//	Scanner s = new Scanner(System.in);
	//	System.out.println("Enter the length of the side of the square");
	//	int i = s.nextInt();
	    int side = 10;
		//	int areaOfSquare;
		int area = side*side;
		System.out.println("Area of the square is: " + area);
	}
	
	@Override
	public void Rectangle() {
	    System.out.println("Rectangle"); 
	}
	
	@Override
	public void Circle() {
	//	System.out.println("Circle");
		int r = 5;
	    double pi = 3.15;
	    double Area = pi*(r*r);
	    System.out.println("The area of the Circle is: " + Area);
	}
	
	@Override
	public void Oval() {
		System.out.println("Oval");
	}
	
	public static void main(String[] args) {
		ShapeArea sa = new ShapeArea();
		sa.Square();
		sa.Circle();
		sa.Rectangle();
		sa.Oval();
	}
}
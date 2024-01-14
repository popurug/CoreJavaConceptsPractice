package com.lambda;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}
public class Area {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the value of radius");
			int r = s.nextInt();
			
			MyInterface ref;
			ref = () -> 3.1415;
			
			System.out.println("Area of the Circle with given radius is = " + r * r * ref.getPiValue());
		}
	}
}

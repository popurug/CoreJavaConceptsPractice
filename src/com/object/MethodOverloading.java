package com.object;

public class MethodOverloading {

	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	int add(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3+ num4;
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println("Sum of two numbers: " + mo.add(10, 20));
		System.out.println("Sum of three numbers: " + mo.add(30, 40, 50));
		System.out.println("Sum of four numbers: " + mo.add(10, 5, 20, 6));
	}
}

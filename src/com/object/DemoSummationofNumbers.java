package com.object;

public class DemoSummationofNumbers {

	public static void main(String[] args) {
		int input = 10;
		int result = summation(input);
	//	System.out.print(result);
		System.out.println("The summation of the given number is: " + result);
	}
	
	public static int summation(int x) {
		int result = (x * (x+1)) / 2;
		return result;
	}
}

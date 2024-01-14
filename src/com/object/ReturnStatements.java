package com.object;

public class ReturnStatements {

	public static void main(String[] args) {
		printMessage();
		int sum = add(8, 5);
		System.out.println(sum);
		
		String s1 = caps("why did you open my dairy mom!!$#?");
		System.out.println(s1);
		
		int[] printArray = givemeArrayFromInts(1, 4, 3);
		System.out.println(printArray[0]);
		System.out.println(printArray[1]);
		System.out.println(printArray[2]);
	}
	
	public static void printMessage() {
		System.out.println("This is my first method");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String caps(String s) {
		return s.toUpperCase();
	}
	
	public static int[] givemeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}

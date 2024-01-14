package com.bayoneproblems;

public class MethodOverloading {
	
	/*static int addNumbersInt(int x, int y) {
		return x + y;
	}
	
	static double addNumbersDouble(double x, double y) {
		return x + y;
	}
	
	static float addNumbersFloat(float x, float y) {
		return x + y;
	}
	
	static String addNumbersString(String x, String y) {
		return x + " " + y;
	}*/
	
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {

	/*	int myNum1 = addNumbersInt(10, 18);
		double myNum2 = addNumbersDouble(4.3, 6.4);
		float myNum3 = addNumbersFloat(12, 15);
		String myNum4 = addNumbersString("Gopinath", "Popuru");
		String myNum5 = addNumbersString("Nishanth", "Bandala");
		System.out.println("int numbers are: " + myNum1);
		System.out.println("double numbers are: " + myNum2);
		System.out.println("float numbers are: " + myNum3);
		System.out.println("string values are: " + myNum4);
		System.out.println("string values are: " + myNum5); */
		
		int am = plusMethod(21, 32);
		double am2 = plusMethod(4.3, 6.26);
		System.out.println("Int numbers are: " + am);
		System.out.println("Double numbers are " + am2);
	}

}

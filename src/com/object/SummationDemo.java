package com.object;

public class SummationDemo {

	public static void main(String[] args) {
		/*
		 * SummationDemo sd = new SummationDemo(); int n = 0; sd.summation(n);
		 */
		int userinput = 20;
		int finalResult = summation(userinput);
		System.out.println("The final summation result is: " + finalResult);
		
		int num1 = 10, num2 = 20, num3 = 40;
		int multiplyResult = multiply(num1, num2);
		System.out.println("The final multiply result is: " + multiplyResult);
		
		int additionResult = addition(num1, num2, num3);
        System.out.println("The final addition result is: " + additionResult);
	}
	
	public static int summation(int n) {
		int result = (n*(n+1))/2;
		return result;
	}
	
	public static int multiply(int num1, int num2) {
		int result = (num1*num2);
		return result;
	}
	
	public static int addition(int num1, int num2, int num3) {
		int result = (num1+num2+num3);
		return result;
	}
}

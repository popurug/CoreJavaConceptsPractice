package com.object;

import java.util.Scanner;

public class UserInputNumbers {

	public static void main(String[] args) {
		int a, b, sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		 a = s.nextInt();
		 
	    System.out.println("Enter the second number: ");
		 b = s.nextInt();
		 
		 sum = a + b;
		 System.out.println("The addition of two numbers is: " + sum);
		 s.close(); 
		 
		int result =  UserInputNumbers.multiply(5, 8);
		System.out.println("The multiplication of given numbers is: " + result);
		
		int res = UserInputNumbers.division(30, 5);
		System.out.println("The division of gievn numbers is: " + res);
		
		 UserInputNumbers.inputTest();
	//	 System.out.println("The output of this custom method is: " + inputTest());
	}
	
	public static int multiply(int x, int y) {
		int mul;
		mul = x * y;
		return mul;
	}
	
	public static int division(int p, int q) {
		int div;
		div = p / q;
		return div;
		
	}
	
	public static void inputTest() {
		Scanner s1 = new Scanner(System.in);
		String message = s1.nextLine();
		if(message.equals("hi")) {
			System.out.println("Hello!");
		}
		s1.close();
	}
}

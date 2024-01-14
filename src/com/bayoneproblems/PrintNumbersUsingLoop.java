package com.bayoneproblems;

import java.util.Scanner;

public class PrintNumbersUsingLoop {

	public int displayNumbers() {
	//	int i, number = 50;
		int i, number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range of numbers: ");
		number = s.nextInt(); 
		System.out.println("The numbers are: ");
        
		for (i = 1; i < number; i++) {
			System.out.print(i + ", ");
		}
	//	s.close();
		return number;
	}
	
	public int addNumbers() {
		int num1, num2, result;
		Scanner s = new Scanner(System.in);
		System.out.println("\n" + "Enter the first number: ");
		num1 = s.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = s.nextInt();
		result = num1 + num2;
		System.out.println("The addition of two numbers: " + result);
	//	s.close();
		return result;
	}
	
	public int multiflyNumbers() {
		int num1, num2, res;
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter the num1 value: ");
		num1 = s.nextInt();
		
		System.out.println("Enter the num2 value: ");
		num2 = s.nextInt();
		res = num1 * num2;
		System.out.println("The multiplication of two numbers is: " + res);
		return res;
	}
	
	public static double divisionNumbers() {
		double num1, num2, finalResult;
		Scanner s = new Scanner(System.in);
		System.out.println("\n" + "Enter the first number: ");
		num1 = s.nextDouble();
		
		System.out.println("Enter the second number: ");
		num2 = s.nextDouble();
		finalResult = num1/num2;
		System.out.println("The division of two numbers is: " + finalResult);
		return finalResult;
	}
	
	public char modulusNumbers() {
		char num1, num2, result;
		Scanner s = new Scanner(System.in);
		System.out.println("\n" + "Enter the first number: ");
		num1 = (char) s.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = (char) s.nextInt();
		result = (char)((char) num1 % num2);
		System.out.println("The modulus of given numbers is: " + result);
		return result;
	}
	
	public void substractionNumbers() {
		int num1, num2, result;
		Scanner s = new Scanner(System.in);
		System.out.println("\n" + "Enter the first number: ");
		num1 = s.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = s.nextInt();
		result = num1 - num2;
		System.out.println("The substraction of two numbers are: " + result);
	}
	
	public static void passingParameters(String fName, String lName, int age) {
		System.out.println(fName + lName + " is " + age);
	}

	public static void main(String[] args) {

		PrintNumbersUsingLoop ps = new PrintNumbersUsingLoop();
		ps.displayNumbers();
		
	//	PrintNumbersUsingLoop ps1 = new PrintNumbersUsingLoop();
		ps.addNumbers();
		ps.multiflyNumbers();
		PrintNumbersUsingLoop.divisionNumbers();
		ps.modulusNumbers();
		ps.substractionNumbers();
		PrintNumbersUsingLoop.passingParameters("Gopinath", "Popuru", 26);
		PrintNumbersUsingLoop.passingParameters("Nishanth", "Bandala", 28);
	}

}

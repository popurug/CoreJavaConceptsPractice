package com.practice;

public class SumOfNumbers {

	public static void main(String args[]) {
		int count = 10;
		int sum = 0;
		
		for(int i=1; i<=count; i++) {
			sum = sum + i;  //LINE A
			System.out.println("Sum after adding " + i + " is : " + sum);
		}
		
		System.out.println();
		System.out.println("Sum of numbers till " + count + " is : " + sum); //LINE B
	}
}

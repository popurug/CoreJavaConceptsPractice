package com.bayoneproblems;

import java.util.Scanner;

public class DisplayEvenNumbers {
	
	public int diplayRangeEvenNumbers() {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range to find even numbers: ");
		num = s.nextInt();
		System.out.println("The list of even numbers from range is: ");
		for(int i = 1; i < num; i++) {
			
			if(i % 2 == 0) {
			//	System.out.print("The list of even numbers from given range is: " + i + ", ");
			//	System.out.println("The list of even numbers from range is: ");
				System.out.print(i + ", ");
			}
		}
		s.close();
		return num;
	}

	public static void main(String[] args) {

	//	int number = 100;
	//	System.out.println("The list of even numbers from 1 to " + number + ": ");
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Enter the range to find even numbers: ");
		int num = s.nextInt();

		for (int i = 1; i < num; i++) {
			// Logic to check if the number is even or not
			// If i%2 == 0, the number is even
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		s.close(); */
		
		DisplayEvenNumbers d = new DisplayEvenNumbers();
		d.diplayRangeEvenNumbers();
	}

}

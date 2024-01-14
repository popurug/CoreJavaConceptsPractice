package com.conditionalstatements;

import java.util.Scanner;

public class PrintFloydsTriangle {

	public static void main(String[] args) {

		int numberOfRows;
		System.out.println("Input number of rows: ");
		Scanner s = new Scanner(System.in);
		numberOfRows = s.nextInt();
		int number = 1;

		for (int row = 1; row <= numberOfRows; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
		s.close();
	}

}

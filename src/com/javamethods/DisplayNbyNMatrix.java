package com.javamethods;

import java.util.Scanner;

public class DisplayNbyNMatrix {

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = s.nextInt();
		printMatrix(n);
		s.close();
	}

}

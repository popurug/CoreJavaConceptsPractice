package com.arrays;

import java.util.Scanner;

public class AddTwoMatricesSameSize {

	public static void main(String[] args) {

		int m, n, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows of matrix");
		m = sc.nextInt();
		System.out.println("Input number of columns of matrix");
		n = sc.nextInt();
		
		int arr[][] = new int[m][n];
		int arr1[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		System.out.println("Input the elements of first matrix");
		for(c = 0; c < m; c++)
			for(d = 0; d < n; d++)
				arr[c][d] = sc.nextInt();
		System.out.println("Input the elements of second matrix");
		for(c = 0; c < m; c++)
			for(d = 0; d < n; d++)
				arr1[c][d] = sc.nextInt();
		
		for(c = 0; c < m; c++)
			for(d = 0; d < n; d++)
				sum[c][d] = arr[c][d] + arr1[c][d];
		
		System.out.println("Sum of the matrices---");
		
		for(c = 0; c < m; c++) {
			for(d = 0; d < n; d++) {
				System.out.print(sum[c][d] + "\t");
				
				System.out.println();
			}
		}
				
	}

}

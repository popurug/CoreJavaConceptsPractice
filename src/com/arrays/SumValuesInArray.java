package com.arrays;

public class SumValuesInArray {

	public static void main(String[] args, String average) {

		int[] arr = {10, 12, 6, 4, 9};
		int sum = 0;
		
		for(int i : arr) {
			sum = sum + i;
			
		}
		System.out.println("The sum is: " + sum);
		
		System.out.println("***************");
		
		int [][]a = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		
		//Calculate sum of all array elements
		int sum1 = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum1 = sum1 + numbers[i];
			
			//calculate average value
			int avg = sum1 / numbers.length;
			
		}
	//	String average = "";
	//	System.out.println("Average value of the array elements is: " + avg);
	}

}

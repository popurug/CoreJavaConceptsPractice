package com.arrays;

import java.util.Arrays;

public class SecondSmallestElementInArray {

	public static void main(String[] args) {

	//	int[] arr = {-1, 4, 0, 2, 7, -3};
		int[] arr = {8, 10, 6, 2, 1, 4};
		System.out.println("The original array is: " + Arrays.toString(arr));
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == min) {
				secondMin = min;
			}else if(arr[i] < min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i] < secondMin) {
				secondMin = arr[i];
			}
		}
		System.out.println("Second smallest number is: " + secondMin);
	}

}

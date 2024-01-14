package com.arrays;

import java.util.Arrays;

public class FindMaxMinValueOfArray {
	static int max;
	static int min;
	public static void minMaxValue(int arr[]) {
		max = arr[0];
		min = arr[1];
		int len = arr.length;
		for(int i = 1; i < len - 1; i = i +2) {
			if(i+1 > len) {
				if(arr[i] > max)
					max = arr[i];
				if(arr[i] < min)
					min = arr[i];
			}
			if(arr[i] > arr[i+1]) {
				if(arr[i] > max)
					max = arr[i];
				if(arr[i] < min)
					min = arr[i + 1];
			}
			if(arr[i] < arr[i + 1]) {
				if(arr[i] < min)
					min = arr[i];
				if(arr[i + 1] > max)
					max = arr[i + 1];
			}
		}
	}

	public static void main(String[] args) {

	//	int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr = {12, 6, 10, 14, 4, 18, 2, 20};
		minMaxValue(arr);
		System.out.println("The original array is: " + Arrays.toString(arr));
		System.out.println("Maximum value for the above array = " + max);
		System.out.println("Minimum value for the above array = " + min);
	}

}

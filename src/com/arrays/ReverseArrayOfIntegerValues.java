package com.arrays;

import java.util.Arrays;

public class ReverseArrayOfIntegerValues {

	public static void main(String[] args) {

		int[] arr = {1789, 2035, 1899, 1456, 2013, 
				    1458, 2458, 1254, 1472, 2365,
				    1456, 2165, 1457, 2456};
		int[] arr1 = {12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
		System.out.println("The original array is: " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.println("The reverse array is: " + Arrays.toString(arr));
		
		System.out.println("************************");
		System.out.println("The original array is: " + Arrays.toString(arr1));
		
		for(int i = 0; i < arr1.length / 2; i++) {
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp;
			
		}
		System.out.println("The reversed array is: " + Arrays.toString(arr1));
	}

}

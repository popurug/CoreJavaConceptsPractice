package com.arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {

	/*	int[] arr = {10789, 2035, 1899, 1456, 2013,
				     1458, 2458, 1254, 1472, 2365,
				     1456, 2165, 1457, 2456};  */
		
		int[] arr = {143, 884, 890, 196, 123, 145};
		System.out.println("The original array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		int index = arr.length-1;
		
		while(arr[index] == arr[arr.length-1]) {
			index--;
		}
		System.out.println("The second largest value is: " + arr[index]);
	}

}

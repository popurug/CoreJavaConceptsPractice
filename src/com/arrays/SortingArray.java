package com.arrays;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		int[] arr = {1789, 2035, 1899, 1456, 2013, 2023, 1458};
		String[] arr1 = {"Java", "Python", "PHP", "C", "C++", "Kotlin"};
		
		System.out.println("Original numeric array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted numeric array: " + Arrays.toString(arr));
		
		System.out.println("Original string array: " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Sorted string array: " + Arrays.toString(arr1));
	}

}

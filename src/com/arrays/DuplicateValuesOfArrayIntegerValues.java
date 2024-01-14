package com.arrays;

public class DuplicateValuesOfArrayIntegerValues {

	public static void main(String[] args) {

		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		int[] arr1 = {2, 4, 6, 8, 10, 10, 4, 8};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j] && (i != j)) {
					System.out.println("Duplicate elements are: " + arr[j]);
				}
			}
		}
		
		System.out.println("*************************");
		for(int m = 0; m < arr1.length; m++) {
			for(int n = m + 1; n < arr1.length; n++) {
				if(arr1[m] == arr1[n] && (m != n)) {
					System.out.println("The duplicate elements are: " + arr1[n]);
				}
			}
		}
	}

}

package com.arrays;

import java.util.Arrays;

public class DuplicateValuesOfArrayStringValues {

	public static void main(String[] args) {

		String[] arr = {"Gopi", "Nishanth", "ManiRam", "Naveen", "Gopi", "Nishanth"};
		System.out.println("The original array elements are: " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j] && (i != j)) {
					System.out.println("The duplicates strings in array are: " + arr[j]);
				}
			}
			System.out.println("The new array elements are: " + Arrays.toString(arr));
		}
		
	}

}

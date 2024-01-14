package com.arrays;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {
	
	public static void uniqueArray(int[] arr) {
		System.out.println("Original array is: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		//Assuming all elements in input array are unique
		int noUniqueElements = arr.length;
		
		//Comparing each element with all other elements
		for(int i = 0; i < noUniqueElements; i++) {
			for(int j = i+1; j < noUniqueElements; j++) {
				if(arr[i] == arr[j]) {
					//Replace duplicate element with last unique element
					arr[j] = arr[noUniqueElements - 1];
					noUniqueElements--;
					j--;
				}
			}
		}
		
		//Copying only unique elements arr into arr1
		int[] arr1 = Arrays.copyOf(arr, noUniqueElements);
		
		//Printing array without duplicates
		System.out.println();
		
		System.out.println("Array with unique values: ");
		
		for(int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		System.out.println();
		System.out.println("--------------------");
	}

	public static void main(String[] args) {

		uniqueArray(new int[] {0, 3, -2, 4, 3, 2});
		uniqueArray(new int[] {10, 22, 10, 20, 11, 22});
	}

}

package com.arrays;

public class EqualityOfTwoArrays {
	public static void equalityCheckingTwoArrays(int[] arr1, int[] arr2) {
		boolean equalOrNot = true;
		
		if(arr1.length == arr2.length) {
			for(int i = 0; i < arr1.length; i++) {
			    if(arr1[i] != arr2[i]) {
			    	equalOrNot = false;
			    }
			}
		}else {
			equalOrNot = false;
		}
		
		if(equalOrNot) {
			System.out.println("Two arrays are equal:");
		}else {
			System.out.println("Two arrays are not equal");
		}
		
	}

	public static void main(String[] args) {

		int[] arr1 = {2, 5, 7, 9, 11};
		int[] arr2 = {2, 5, 7, 8, 11};
		int[] arr3 = {2, 5, 7, 9, 11};
		
		equalityCheckingTwoArrays(arr1, arr2);
		equalityCheckingTwoArrays(arr1, arr3);
	}

}

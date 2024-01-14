package com.arrays;

public class PrintAllTheLeadersInTheArray {

	public static void main(String[] args) {

		int arr[] = {10, 9, 14, 23, 15, 0, 9};
		int length = arr.length;
		System.out.println("The leaders in the given array is: ");
		for(int i = 0; i < length; i++) {
			int j;
			for( j = i + 1; j < length; j++) {
				if(arr[i] <= arr[j])
					break;
			}
			if(j == length)
			//	System.out.println("The leaders in the given array is: ");
				System.out.println(arr[i] + " ");
		}
	}

}

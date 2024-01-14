package com.arrays;

public class ArrayExample {

	public static void main(String[] args) {

		//Creating an array of integer type
		int arr[] = new int[5];
		
		//Adding elements into array
		arr[0] = 12;
		arr[1] = 8;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 16;
	//	arr[5] = 20;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
				
	}

}

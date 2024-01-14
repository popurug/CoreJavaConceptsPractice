package com.arrays;

import java.util.ArrayList;

public class FindCommonElementsInSortedArrays {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
	/*	int arr1[] = {2, 4, 8};
		int arr2[] = {2, 3, 4, 8, 10, 16};
		int arr3[] = {4, 8, 14, 40}; */
		
		int arr1[] = {1, 2, 3, 1, 4, 3};
		int arr2[] = {8, 8, 4, 1, 3, 4};
		int arr3[] = {9, 10, 12, 14, 16, 18, 20, 1, 8, 4};
		int x = 0, y = 0, z = 0; 
		
		while(x < arr1.length && y < arr2.length && z < arr3.length) {
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				nums.add(arr1[x]);
				x++;
				y++;
				z++;
			}else if(arr1[x] < arr2[y])
				x++;
			else if(arr2[y] < arr3[z])
				y++;
			else
				z++;
		}
		System.out.println("Common elements from three sorted (in non-decreasing order) arrays: ");
		System.out.println(nums);
	}

}

package com.arrays;

public class PositiveNegativeNumsSumCloseToZero {

	public static void main(String[] args) {

	//	int arr[] = { 1, 5, -4, 7, 8, -6 };
		int arr[] = {1, 6, -5, 2, 4, 8};
		int size = arr.length;
		int l, r, minSum, sum, minLNum, minRNum;

		if (size < 2) {
			System.out.println("Invalid Input");
			return;
		}

		minLNum = 0;
		minRNum = 1;
		minSum = arr[0] + arr[1];

		for (l = 0; l < size - 1; l++) {
			for (r = l + 1; r < size; r++) {
				sum = arr[l] + arr[r];
				if (Math.abs(minSum) > Math.abs(sum)) {
					minSum = sum;
					minLNum = l;
					minRNum = r;
				}
			}
		}

		System.out.println("Two elements whose sum is minimum are " + arr[minLNum] + " and " + arr[minRNum]);

	}

}

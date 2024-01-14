package com.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOutOfBound {

	public static void main(String[] args) {
		int[] Array = {(int) 10.0,(int) 20.0,(int) 30.0,(int) 40.0,(int) 50.0};
		System.out.println("The array elements are as follows: \n");
		System.out.println(Arrays.toString(Array));
		Scanner s = new Scanner(System.in);
		System.out.println("Please provide the address of the required element:\n");
		float numbers = s.nextFloat();
		s.close();
		System.out.println("Number at your selected address is " + Array[(int) numbers]);
	}
}

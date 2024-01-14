package com.object;

import java.util.Scanner;

public class TryCatchExamples {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What's your favourite number?:");
		
		try {
			int n = s.nextInt();
			System.out.println(n);
		}catch(Exception e) {
			System.out.println("Sorry, please enter a number");
		}
		
		try {
			int[] a = {4};
			System.out.println(a[1]);
		}catch(NullPointerException e) {
			System.out.println("Your array is null!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds!");
		}catch(Exception e) {
			System.out.println("Something else went wrong!");
		}
		s.close();
	}
}

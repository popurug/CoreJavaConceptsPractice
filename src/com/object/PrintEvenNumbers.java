package com.object;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int n = 100;
		System.out.println("Even Numbers from 1 to "+n+" are: ");
		for(int i=0; i<=n; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}

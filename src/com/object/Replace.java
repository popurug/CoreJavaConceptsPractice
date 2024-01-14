package com.object;

public class Replace {

	public static void main(String[] args) {
		int first = 6;
		int second = 15;
		int third;
		third = second;
		second = first;
		first = third;
		
		System.out.println("first=" + first + " second=" + second);
	}
}

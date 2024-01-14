package com.practice;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String args[]) {
		int num = 0;
		int reverseNum = 0;
		System.out.println("Input your numbers and then press enter: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		while(num != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num%10;
			num = num/10;
		}
		System.out.println("Reverse of input number is: " + reverseNum);
	}
}

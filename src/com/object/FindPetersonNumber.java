package com.object;

import java.util.Scanner;

public class FindPetersonNumber {

	static long[] factorial = new long[] {1,1,2,6,24,120,720,5040,40320,362880};
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		//storing the input number in the variable num
		int num = s.nextInt();
		
		if(isPeterson(num)) {
			System.out.println(num+" is a Peterson number.");
		}else {
			System.out.println(num+" is not a Peterson number.");
		}
		s.close();
	}
	
	static boolean isPeterson(int n) {
		int num=n, sum=0;
		while(n > 0) {
			int lastDigit = n % 10;
			sum += factorial[lastDigit];
			n = n/10;
		}
		return (sum == num);
	}
}

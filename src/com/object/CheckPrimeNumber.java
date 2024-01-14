package com.object;

import java.util.Scanner;

public class CheckPrimeNumber {

	static boolean flag = false;
	public static void main(String[] args) {

		/*
		 * int num = 29; boolean flag = false; for(int i=2; i<=num/2; i++) { //condition
		 * for non-prime number if(num % i == 0) { flag = true; break; } }
		 * 
		 * if(!flag) System.out.println(num + " is a prime number. "); else
		 * System.out.println(num + " is not a prime number. "); }
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int res = s.nextInt();
		int finalResult = checkPrime(res);

		/*
		 * if (!flag) { System.out.println("The given number is a prime number. "); }
		 * else { System.out.println("The given number is not a prime number. "); }
		 */

	}

	public static int checkPrime(int num) {
		// int result = num % i == 0;

		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				boolean flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("The given number is a prime number. ");
		} else {
			System.out.println("The given number is not a prime number. ");
		}
		return num;

	}
}
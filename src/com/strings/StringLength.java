package com.strings;

import java.util.Scanner;

public class StringLength {
	public static int usingScanner() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		int c = a + b;
		System.out.println("The addition of two given numbers are: " + c);
		return 0;
		
	}
	
	public void multiplicationMethod() {
		int a = 20;
		int b = 60;
		int c = a * b;
		System.out.println("The multiplication of two given numbers are: " + c);
	}
	
	public void palindromeExample() {
		int r, sum = 0, temp;
		int num = 454;
		temp = num;
		while(num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if(temp == sum)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}

	public static void main(String[] args) {
		 
		String s = "Gopinath Popuru";
		int len = s.length();
		System.out.println("The string length of '"+s+"' is: " + len);
		System.out.println("******************************");
		StringLength.usingScanner();
		System.out.println("****()###########()!!!!!!!");
		StringLength sl = new StringLength();
		sl.multiplicationMethod();
		System.out.println("&&&&()!!!!");
		sl.palindromeExample();
	}

}

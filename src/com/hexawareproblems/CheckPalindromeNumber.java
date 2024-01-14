package com.hexawareproblems;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int r, sum=0, temp;
		int n = 884;
		temp = n;
		while(n > 0) {
			r = n%10;
			sum = (sum*10) + r;
			n = n/10;
		}
		
		if(temp == sum)
			System.out.println(n + " The given number is plaindrome");
		else
			System.out.println(n + " The given number is not palindrome");
	}

}

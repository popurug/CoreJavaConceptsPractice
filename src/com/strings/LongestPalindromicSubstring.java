package com.strings;

public class LongestPalindromicSubstring {
	
	static int longPalSubstring(String str1) {
		int n = str1.length();
		boolean table[][] = new boolean[n][n];
		int mLength = 1;
		for(int i=0; i<n; i++)
			table[i][i] = true;
		int start = 0;
		for(int i=0; i<n-1; i++) {
			if(str1.charAt(i) == str1.charAt(i + 1)) {
				table[i][i+1] = true;
				start = i;
				mLength = 2;
			}
		}
		for(int k=3; k<=n; k++) {
			for(int i=0; i<n-k+1; i++) {
				int j = i+k-1;
				if(table[i+1][j-1] && str1.charAt(i) == str1.charAt(j)) {
					table[i][j] = true;
					
					if(k > mLength) {
						start = i;
						mLength = k;
					}
				}
			}
		}
		System.out.print("The longest palindrome substring in the given string is: ");
		printSubStr(str1, start, start + mLength - 1);
		return mLength;
	}
	
	static void printSubStr(String str1, int l, int h) {
		System.out.println(str1.substring(l, h + 1));
	}

	public static void main(String[] args) {
		String str1 = "My dad mom has several pairs of shoes";
		System.out.println("The given string is: " + str1);
		System.out.println("The length of the palindromic substring is: " + longPalSubstring(str1));

		
	}

}

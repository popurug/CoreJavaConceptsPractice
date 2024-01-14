package com.object;

import java.util.Scanner;

public class RemoveLetter {

	static void removeChar(String s, char c) {
		int j, count=0, n = s.length();
		char[]t = s.toCharArray();
		for(int i = j = 0; i<n; i++) {
			if(t[i] != c)
				t[j++] = t[j];
			else
				count++;
		}
		while(count > 0) {
			t[j++] = '\0';
			count--;
		}
		System.out.println(t);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the statement: ");
		String str = s.nextLine();
		
		System.out.println("Enter the Letter you want to remove: ");
		String ltr = s.nextLine();
		char l = ltr.charAt(0);
		
		String s1 = "Edureka";
		removeChar(str, l);
	}
}

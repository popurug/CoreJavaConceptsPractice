package com.practice;

public class WhileExample {

	public static void main(String args[]) {
		int i=0;
		while(i<=10) {
		//	System.out.println(i);
			i++;
			
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}

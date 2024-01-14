package com.object;

public class RecursionInJava {

	public static void main(String[] args) {
		sayHi(5);
		System.out.println("=============================");
		countBackwards(12);
	}
	
	public static void sayHi(int n) {
		if(n == 0) {
			System.out.println("Done!!");
		}else {
			System.out.println("hi");
			n--;
			sayHi(n);
		}
	}
	
	public static void countBackwards(int n) {
		if(n == 0) {
			System.out.println("Done with this!!!!");
		}else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}
}

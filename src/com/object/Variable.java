package com.object;

public class Variable {
 
    int a=10;  //Instance variable
    static int c = 30;  //Static variable
	public static void main(String[] args) {
		int b=20;  //Local variable
		Variable v = new Variable();
		System.out.println("Instance variable=" + v.a);
		System.out.println("Local variable=" + b);
		System.out.println("Static variable=" + c);
	}
}

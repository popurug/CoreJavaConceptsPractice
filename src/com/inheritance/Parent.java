package com.inheritance;

public class Parent {

	protected int X=5;
	protected void Print() {
		System.out.println("Hello World");
	}
	public void publicPrint() {
		Print();
	}
	public int getX() {
		return X;
	}
}

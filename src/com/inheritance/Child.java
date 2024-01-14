package com.inheritance;

public class Child extends Parent {

	int X = 10;
	protected void Print() {
		System.out.println("child class: " + X + "parent class: " + "" + super.X);
	}
	
	public static void main(String[] args) {
		Summation s = new Summation();
		System.out.println(s.add(100, 200));
		
		Child c = new Child();
		c.Print();
		System.out.println(c.getX());
	}
	
}

package com.object;

class Parent{
	void display() {
		System.out.println("Parent method");
	}
}

class Child extends Parent {
	void display() {
		super.display();
		System.out.println("Child method");
	}
}
public class Override {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}

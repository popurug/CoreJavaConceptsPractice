package com.object;

class Parent1 {
	public void m1() {
		System.out.println("This is parent method: ");
	}
}

class Child1 extends Parent1 {
	public void m2() {
		System.out.println("This is child method: ");
	}
}

public class Inheritance {

	public static void main(String[] args) {
	//	Parent1 p = new Parent1();
	//	p.m1();
	//	p.m2();
		Child1 c = new Child1();
		c.m1();
		c.m2();
	}
}

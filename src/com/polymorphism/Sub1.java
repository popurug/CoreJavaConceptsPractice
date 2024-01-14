package com.polymorphism;

public class Sub1 extends Super {
	@Override
	//no issue while throwing same exception
	void m1() throws RuntimeException {
		System.out.println("From child1 m1() method: ");
	}

}

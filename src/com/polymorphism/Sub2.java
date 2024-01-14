package com.polymorphism;

public class Sub2 extends Super {
	@Override
	//no issue while throwing subclass exception
	void m1() throws ArithmeticException {
		System.out.println("From child2 m1() method: ");
	}

}

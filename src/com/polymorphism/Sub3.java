package com.polymorphism;

public class Sub3 extends Super {
	@Override
	//no issue while not throwing any exception
	void m1() {
		System.out.println("From child3 m1() method: ");
	}

}

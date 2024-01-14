package com.polymorphism;

public class Sub4 extends Super {
	@Override
	//compile time error
	//issue while throwing parent exception
	void m1() throws Exception {
		System.out.println("From child4 m1() method: ");
	}

}

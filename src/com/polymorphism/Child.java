package com.polymorphism;

public class Child extends Parent {
	@Override
	public void show() {
		System.out.println("Child's show() method: ");
	}
	
	@Override
	//no issue while throwing unchecked exception
	void m1() throws ArithmeticException {
		System.out.println("From child m1() method: ");
	}
	
	@Override
	//compile time error
	//issue while throwing checked exception
	void m2() throws Exception{
		System.out.println("From child m2() method: ");
	}

}

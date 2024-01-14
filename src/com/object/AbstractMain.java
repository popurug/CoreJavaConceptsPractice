package com.object;
abstract class A {
	abstract void display();
	void show() {
		System.out.println("SHOW METHOD");
	}
}

class B extends A {

	//@Override
	void display() {
     System.out.println("Abstract Method in A");		
	}
	
}
public class AbstractMain {

	public static void main(String[] args) {
		B obj = new B();
	//	A obj = new A();
		obj.display();
		obj.show();
	}
}

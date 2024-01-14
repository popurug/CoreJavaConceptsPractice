package com.polymorphism;

public class Childing extends Parenting {
	//new m1() method
	//unique to child class
	private void m1() {
		System.out.println("From child m1() method: ");
	}
	
	//Overriding method with
	//more accessibility
	@Override
	public void m2() {
		System.out.println("From child m2() method: ");
	}
	
	void show() {
		
	}
	
	//This method hides method1() in parent
	static void method1() {
		System.out.println("From child static method1(): ");
	}
	
	//This method overrides method2() in parent
	@Override
	public void method2() {
		System.out.println("From child: " + " non static instance method2(): ");
	}
	
	//This is new method with the same name as the private
	//method in super class
	private void privateMethod() {
		System.out.println("This is a private method in sub class: ");
	}
	
	//This method overrides the public method in
	//super class
	public void publicMethod() {
		System.out.println("This is a public method in sub class: ");
		privateMethod(); //calls private method in sub class, not super class
	}
	
	public String method() {
		System.out.println("This is a method() in sub class: ");
		return "Gopinath Popuru";
	}
	
	//This method overrides showing() of Parent
	@Override
	void showing() {
		super.showing();
		System.out.println("This is Child's showing() method: ");
	}

}

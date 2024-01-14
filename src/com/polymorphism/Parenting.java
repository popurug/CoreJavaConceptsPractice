package com.polymorphism;

public class Parenting {
	//private methods are not overridden
	private void m1() {
		System.out.println("From parent m1() method: ");
	}
	
	protected void m2() {
		System.out.println("From parent m2() method: ");
	}
	
	 void show() {
		System.out.println("This is a show() method: ");
	}
	 
	 static void method1() {
		 System.out.println("From parent: " + " static method1()");
	 }
	 
	 void method2() {
		 System.out.println("From parent: " + " non-static instance method2()");
	 }
	 
	 private void privateMethod() {
		 System.out.println("This is a private method in super class: ");
	 }
	 
	 public void publicMethod() {
		 System.out.println("This is a public method in super class: ");
		 privateMethod();
	 }
	 
	 public Object method() {
		 System.out.println("This is the method() in super class: ");
		 return new Object();
	 }
	 
	 void showing() {
		 System.out.println("This is Parent's showing() method: ");
	 }

}

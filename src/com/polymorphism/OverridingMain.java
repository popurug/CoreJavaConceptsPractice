package com.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {

		Parenting p1 = new Parenting();
		p1.m2();
	//	p1.m1();
		p1.show();
		
		Parenting p2 = new Childing();
		p2.m2();
		Parenting.method1();
		p2.method2();
		
		Parenting pr = new Parenting();
		pr.publicMethod();
		Childing ch = new Childing();
		ch.publicMethod();
		
		pr.method();
		ch.method();
		
		Parenting pring = new Childing();
		pring.showing();
	}

}
package com.polymorphism;

public class TestMethodOverriding {

	public static void main(String[] args) {

		//If a parent type reference refers to a
		//parent object, then parent's show is called
		Parent p1 = new Parent();
		p1.show();
	//	p1.draw(4);
		System.out.println("The draw method is: " + p1.draw(4));
		
		//If a parent type reference refers to a child 
		//object, then child's show method is called
		Parent p2 = new Child();
		p2.show();
	}

}

package com.functional.inteface;

@FunctionalInterface
public interface Bird {
	
	void fly(int height);
	default void eat(String food) {
		System.out.println("I eat "+ food);
	}

}

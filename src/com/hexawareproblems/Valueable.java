package com.hexawareproblems;

public interface Valueable {
	default void doIt() {
		System.out.println("Do it now");
	}
	
	default void speak() {
		System.out.println("Dog shouts like bow bow bow..");
	}
	
	default void display() {
		System.out.println("This method is used for displaying the content...");
	}
	
	default void moving() {
		System.out.println("This method is used for moving the objects.....");
	}
	
	static void eating() {
		System.out.println("This method is used for eating the food......");
	}
	
	static void drinking() {
		System.out.println("This method is used for drinking the water......");
	}
	
	@FunctionalInterface
	interface Sayable1 extends Valueable{
		void say(String msg);  //abstract method
		
		/*
		 * default void speak(String msg) {
		 * System.out.println("Dog shouts like bow bow bow.."); }
		 */
		
		static void running() {
			System.out.println("This method is used for running the machine....");
		}
		
		static void batting() {
			System.out.println("This method is used for batting the player.....");
		}
		
		
	}

}

package com.hexawareproblems;

import com.hexawareproblems.Valueable.Sayable1;

public class NonFunctionalInterface implements Sayable1, Valueable {
	public void say(String msg) {
		System.out.println(msg);
	}
	

	public static void main(String[] args) {

		NonFunctionalInterface nfi = new NonFunctionalInterface();
		nfi.say("Hello there, Welcome to my java world: ");
		nfi.doIt();
		nfi.speak();
	    nfi.display();
	    nfi.moving();
	    Valueable.eating();
	    Sayable1.running();
	    Valueable.drinking();
	    Sayable1.batting();

	}

}


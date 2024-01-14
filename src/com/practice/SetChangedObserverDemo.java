package com.practice;

import java.util.Observable;
import java.util.Observer;

//
class Observer2 implements Observer{
	
	public void update(Observable obj, Object args) {
		
	}
}

//
class BeingObserved1 extends Observable{
	void func1() {
		setChanged();
		System.out.println("Change status with setChanged: " + hasChanged());
		notifyObservers();
	}
	
	void func2() {
		System.out.println("Change status without setChanged: " + hasChanged());
		notifyObservers();
	}
}

public class SetChangedObserverDemo {

	//Driver method of the program
	public static void main(String args[]) {
		boolean status;
		BeingObserved1 beingObserved1 = new BeingObserved1();
		Observer2 observer2 = new Observer2();
		beingObserved1.addObserver(observer2);
		beingObserved1.func1();
		beingObserved1.func2();
	}
}

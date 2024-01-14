package com.practice;

import java.util.Observable;
import java.util.Observer;

//This is observer
class Observer1 implements Observer{
	
	public void update(Observable obj, Object arg) {
		System.out.println("Observer1 is added");
	}
}

//This is class being observed
class BeingObserved extends Observable{
	
	void incre() {
		setChanged();
		notifyObservers();
	}
}

public class ObserverDemo {

	//Driver method of the program
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		BeingObserved beingObserved = new BeingObserved();
		Observer1 observer = new Observer1();
		Observer observer1 = null;
		beingObserved.addObserver(observer1);
		beingObserved.incre();
	}
}

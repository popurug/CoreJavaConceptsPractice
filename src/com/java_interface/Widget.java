package com.java_interface;

public abstract class Widget {

	public int xcor;
	
	public int ycor;
	
	public int getXcor() {
		return xcor;
	}
	
	public abstract void doAction(); //Just signature + abstract
}

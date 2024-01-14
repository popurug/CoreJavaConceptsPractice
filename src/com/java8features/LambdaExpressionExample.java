package com.java8features;

public class LambdaExpressionExample {

	public static void main(String[] args) {

		int width = 10;
		
		//without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
			
			public void paint() {
				System.out.println("This method is used for paint the wall!!!");
			}
			
			public void color() {
				System.out.println("This function is used for color the walls!!");
			}
		};
		d.draw();
		d.paint();
		d.color();
	}

}

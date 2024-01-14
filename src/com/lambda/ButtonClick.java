package com.lambda;

import java.awt.Button;
import java.awt.Frame;

public class ButtonClick {

	public static void main(String[] args) {
		Frame frame = new Frame("Java - 8 Action-Listener");
		
		Button b = new Button("click me");
		b.setBounds(40,80,60,40);
		
		b.addActionListener(o -> System.out.println("Hello World. Welcome to my java world"));
		frame.add(b);
		
		frame.setSize(150,150);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

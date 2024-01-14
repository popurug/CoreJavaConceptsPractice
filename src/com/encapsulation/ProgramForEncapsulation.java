package com.encapsulation;

public class ProgramForEncapsulation {

	public static void main(String[] args) {
		Cars c = new Cars("BMW", 25000, "200kmph");
		System.out.println("Name: " + c.getName() + " Price: " + c.getPrice() + " topSpeed: " + c.getTopSpeed());
		System.out.println("Stats after updation ");
		c.setPrice(45000);
		c.setTopSpeed("250kmph");
		System.out.println("Name: " + c.getName() + " Price: " + c.getPrice() + " topSpeed: " + c.getTopSpeed());
	}
}

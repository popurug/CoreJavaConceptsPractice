package com.inheritance;

public class Programmer extends Employee {
	double bonus = 10000;

	public static void main(String[] args) {

		Programmer p = new Programmer();
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Bomus of programmer is: " + p.bonus);
	}

}

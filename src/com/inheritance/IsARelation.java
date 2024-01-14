package com.inheritance;

import java.util.ArrayList;
import java.util.List;

public class IsARelation {

	public static void main(String[] args) {
		Customer c1 = new Customer("Raju", "Banglore");
		Customer c2 = new Customer("Shiva", "Hyderabad");
		Customer c3 = new Customer("Sachin", "Mumbai");
		Customer c4 = new Customer("Prashanth", "Vizag");
		Customer c5 = new Customer("Jhon", "Goa");
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		
		Store FruitSmoothiesFranch = new Store(customers);
		
		List<Customer> cust = FruitSmoothiesFranch.customerList();
		for(Customer cst : cust) {
			System.out.println("Name of the Customer : " + cst.Name + ", " + "City: " + cst.City);
		}
	}
}

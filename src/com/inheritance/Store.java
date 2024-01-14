package com.inheritance;

import java.util.List;

public class Store {
	
	private final List<Customer> customers;
	
	Store(List<Customer> customers) {
		this.customers = customers;
	}
	
	public List<Customer> TotalAccountsInBank() {
		return customers;
	}

	public List<Customer> customerList() {
		// TODO Auto-generated method stub
		return null;
	}

}

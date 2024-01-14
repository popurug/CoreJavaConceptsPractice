package com.banking;

public class FirstBank {

	public static void main(String[] args) {
		Account gopi = new Account("Gopinath Popuru", "A884");
		Account nick = new Account("Nishanth Bandala", "A143");
		gopi.showMenu();
		nick.showMenu();
	}
}

package com.polymorphism;

public class MorphismExample {

	public static void main(String[] args) {

		CashPayment c = new CashPayment();
		c.pay();

		// Now the initialization is done using runtime polymorphism and
		// it can have many forms at runtime
		// Single payment "p" instance can be used to pay cash and credit card.
		Payment p = new CashPayment();
		p.pay(); // pay by cash
		p = new CreditPayment();
		p.pay(); // pay by credit card
	}

}

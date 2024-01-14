package com.abstraction;

abstract class Loan {
	abstract int Interest();
}

class AB extends Loan {
	int Interest() {
		return 10;
		
	}
}

class BOB extends Loan {
	int Interest() {
		return 15;
	}
}

class IDBC extends Loan {
	int Interest() {
		return 5;
	}
}

class SBI extends Loan {
	int Interest() {
		return 7;
	}
}

public class RateOfInterest {

	public static void main(String[] args) {
		Loan loan = new AB();
		System.out.println("\n Rate of Interest of Andhra Bank is: \n " + loan.Interest() + " %");
		loan = new BOB();
		System.out.println("\n Rate of Interest of Bank of Baroda is: \n " + loan.Interest() + " %");
		loan = new IDBC();
		System.out.println("\n Rate of Interest of IDBC bank is: \n " + loan.Interest() + " %");
		loan = new SBI();
		System.out.println("\n Rate of Interest of State Bank of India is: \n " + loan.Interest() + " %");
		
	}
}

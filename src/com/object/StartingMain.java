package com.object;
import java.util.Scanner;

public class StartingMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Cars car1 = new Cars();
		Cars car2 = new Cars();
		Cars car3 = new Cars();
		Cars car4 = new Cars();
		Cars car5 = new Cars();
		
		Bikes b1 = new Bikes();
		Bikes b2 = new Bikes();
		Bikes b3 = new Bikes();
		Bikes b4 = new Bikes();
		Bikes b5 = new Bikes();
		
		car1.name = "Lamborghini";
		car2.name = "Ferrari";
		car3.name = "Bugatti";
		car4.name = "Pagani";
		car5.name = "Porsche";
		
		b1.name = "Harley Davidson";
		b2.name = "Ducati";
		b3.name = "Suzuki";
		b4.name = "Ecosse";
		b5.name = "Yamaha";
		
		b1.cost = "$130,000";
		b2.cost = "$232,000";
		b3.cost = "$200,000";
		b4.cost = "$300,000";
		b5.cost = "$500,000";
		
		car1.cost = "$203,000";
		car2.cost = "$252,000";
		car3.cost = "$3,000,000";
		car4.cost = "$1,400,000";
		car5.cost = "$293,000";
		
		System.out.println("What do you want to buy?");
		System.out.println("1. Bikes");
		System.out.println("2. Cars");
		int choice;
		System.out.println("Enter your choice: ");
		choice = s.nextInt();
		if (choice == 1) {
			System.out.println("We have 5 models: ");
			System.out.println("1. Harley Davidson");
			System.out.println("2. Ducati");
			System.out.println("3. Suzuki");
			System.out.println("4. Pagani");
			System.out.println("5. Yamaha");
			System.out.println("Enter your choice: ");
			int n;
			n = s.nextInt();
			if (n == 1) {
				System.out.println("The cost of the Harley Davidson: " + b1.cost);
			}
			else if (n == 2) {
				System.out.println("The cost of the Ducati: " + b2.cost);
			}
			else if (n == 3) {
				System.out.println("The cost of the Suzuki: " + b3.cost);
			}
			else if (n == 4) {
				System.out.println("The cost of the Pagani: " + b4.cost);
			}
			else if (n == 5) {
				System.out.println("The cost of the Yamaha: " + b5.cost);
			}
			else {
				System.out.println("Please enter the value in between 1-5");
			}
		}
		else if (choice == 2) {
			System.out.println("We have 5 models available: ");
			System.out.println("1. Lamborghini");
			System.out.println("2. Ferrari");
			System.out.println("3. Bugati");
			System.out.println("4. Ecosse");
			System.out.println("5. Porsche");
			System.out.println("Enter the choice: ");
			int c;
			c = s.nextInt();
			if (c == 1) {
				System.out.println("The cost of Lamborghini: " + car1.cost);
			}
			else if (c == 2) {
				System.out.println("The cost of Ferrari: " + car2.cost);
			}
			else if (c == 3) {
				System.out.println("The cost of Bugati: " + car3.cost);
			}
			else if (c == 4) {
				System.out.println("The cost of Ecosse: " + car4.cost);
			}
			else if (c == 5) {
				System.out.println("The cost of Porsche: " + car5.cost);
			}
			else {
				System.out.println("Please enter the value in between 1-5");
			}
		}
		else {
			System.out.println("Please enter the choice between 1-2");
		}
	}
}

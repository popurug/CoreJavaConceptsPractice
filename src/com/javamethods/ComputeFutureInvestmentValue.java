package com.javamethods;

import java.util.Scanner;

public class ComputeFutureInvestmentValue {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the investment amount: ");
		double investment = s.nextDouble();
		System.out.println("Input the rate of interest: ");
		double rate = s.nextDouble();
		System.out.println("Input number of years: ");
		int year = s.nextInt();
		rate *= 0.01;

		System.out.println("Years FutureValue");
		for (int i = 1; i <= year; i++) {
			int formatter = 19;
			if (i >= 10)
				formatter = 18;
			System.out.printf(i + "%" + formatter + ".2f/n", futureInvestmentValue(investment, rate / 12, i));
		}
		s.close();
	}

}

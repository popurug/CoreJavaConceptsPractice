package com.java_interface;

public class TestInterface {
	
public static void main(String[] args) {
  RBI hdfc = new HDFC();
  hdfc.rateOfInterest();
  
  RBI sbi = new SBI();
  sbi.rateOfInterest();
  
  RBI icici = new ICICI();
  icici.rateOfInterest();
  
  RBI bofa = new BankOfAmerica();
  bofa.rateOfInterest();
}
}

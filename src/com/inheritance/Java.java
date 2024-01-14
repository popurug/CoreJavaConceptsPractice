package com.inheritance;

public class Java extends Computers {

	void classRoom() {
		System.out.println("Focus on Java...");
	}
	
	public static void main(String[] args) {
		Java j = new Java();
		j.enrolled();
		j.studies();
		j.classRoom();
	}
}

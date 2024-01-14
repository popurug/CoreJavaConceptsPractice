package com.inheritance;

public class ProjectManagment extends Student {

	void studies() {
		System.out.println("Studying Project Management....");
	}
	
	public static void main(String[] args) {
		ProjectManagment pm = new ProjectManagment();
		pm.studies();
		pm.studies();
	}
}

package com.bayoneproblems;

public class Singleton {

	public static void main(String[] args) {

		Database db1;

		// refers to the only object of database
		db1 = Database.getInstance();

		db1.getConnection();
	}

}

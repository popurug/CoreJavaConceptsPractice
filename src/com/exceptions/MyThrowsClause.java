package com.exceptions;

public class MyThrowsClause {

	public static void main(String[] args) {
		MyThrowsClause myt = new MyThrowsClause();
		try {
			for(int i=0; i<5; i++) {
				myt.getJunk();
				System.out.println(i);
			}
		}catch(InterruptedException iex) {
			iex.printStackTrace();
		}
	}
	
	public void getJunk() throws InterruptedException {
		Thread.sleep(1000);
	}
}

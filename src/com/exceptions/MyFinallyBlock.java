package com.exceptions;

public class MyFinallyBlock {

	public static void main(String[] args) {
		try {
			int i = 10/0;
		}catch(Exception ex) {
			System.out.println("Inside 1'st catch Block");
		}finally {
			System.out.println("Inside 1'st finally Block");
		}
		
		try {
			int i = 10/10;
		}catch(Exception ex) {
			System.out.println("Inside 2'nd catch Block");
		}finally {
			System.out.println("Inside 2'nd finally Block");
		}
	}
}

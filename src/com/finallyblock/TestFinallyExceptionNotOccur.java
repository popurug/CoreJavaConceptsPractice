package com.finallyblock;

public class TestFinallyExceptionNotOccur {

	public static void main(String[] args) {

		getData();
		System.out.println("End of main......");
	}
	
	private static int getData() {
		try {
			System.out.println("Before Division " );
			int data = 25/5;
			String s = "";
			System.out.println(s.toString());
			String[] str = new String[6];
			System.out.println(str.length);
			String s1 = "Gopi";
			System.out.println(str[5]);
			
			System.out.println("After Division " + data);
			//return data;
		}catch(NullPointerException e) {
			System.out.println("Exception caught" +  e);
			throw e;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound: " + e);
			throw e;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		//executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code executed......");
		return -1;
	}

}

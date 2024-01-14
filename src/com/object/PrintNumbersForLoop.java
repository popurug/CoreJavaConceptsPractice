package com.object;

public class PrintNumbersForLoop {

	public static void main(String[] args) {
		
		 /* for(int i=0; i<=100; i++) { System.out.println(i); if(i==50) break;
		  
		  }*/
		
			/*
			 * int i = 0; while(i<=100) { System.out.println(i); i++; if(i==40) break; }
			 */
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
			if(i==70)
				break;
		}while(i<=100);
		 
	}
}

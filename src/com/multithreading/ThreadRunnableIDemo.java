package com.multithreading;

    class Hunger implements Runnable {
    	
	@Override
	public void run() {
       for(int i=0; i<=5; i++) {
    	   System.out.println("Hi, Welcome to my home: ");
    	   try {
    		   Thread.sleep(1000);
    	   }catch(Exception e) {
    		   
    	   }
       }
	}
    }
    
    class Strike implements Runnable{

		@Override
		public void run() {
			for(int i=0; i<=5; i++) {
				System.out.println("Hello, Welcome to my java world: ");
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
    	
    }
	public class ThreadRunnableIDemo {
		
	public static void main(String[] args) {
		Runnable h1 = new Hunger();
		Runnable s1 = new Strike();
		
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(s1);
		
		t1.start();
		/*
		 * try { Thread.sleep(1000); }catch(Exception e){
		 * 
		 * }
		 */
		t2.start();
	}

}

package com.practice;

public class RunnableMyThread implements Runnable {

	public void run(){
		System.out.println("Now the thread is running....");
	}
	
	//Main method
	public static void main(String args[]) {
		
		//creating an object of the class RunnableMyThread
		Runnable r1 = new RunnableMyThread();
		
		//creating an object of the class Thread using Thread(Runnable r, String name)
		Thread th1 = new Thread(r1, "My new thread");
		
		//the start() method moves the thread to the active state
		th1.start();
		
		//getting the thread name by invoking the getName() method
		String str = th1.getName();
		System.out.println(str);
	}
}

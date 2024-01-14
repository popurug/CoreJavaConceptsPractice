package com.object;

import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask {
	public static int i = 1;
	
	//TimerTask.run() method will be used to perform the action of the task
	public void run() {
		System.out.println("This is called " + i++ + " time");
	}
}
public class JavaTimer {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		//Helper class extends TimerTask
		TimerTask task = new Helper();
		
		timer.schedule(task, 200, 5000);
	}
}

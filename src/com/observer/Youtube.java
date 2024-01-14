package com.observer;

public class Youtube {

	public static void main(String[] args) {
    
		Channel gopiwritings = new Channel();
		
		Subscriber s1 = new Subscriber("Nishanth");
		Subscriber s2 = new Subscriber("Samrat");
		Subscriber s3 = new Subscriber("Harsh");
		Subscriber s4 = new Subscriber("Kiran");
		Subscriber s5 = new Subscriber("Pravin");
		
		gopiwritings.subscribe(s1);
		gopiwritings.subscribe(s2);
		gopiwritings.subscribe(s3);
		gopiwritings.subscribe(s4);
		gopiwritings.subscribe(s5);
		
		gopiwritings.unSubscribe(s3);
		
		s1.subscribeChannel(gopiwritings);
		s2.subscribeChannel(gopiwritings);
		s3.subscribeChannel(gopiwritings);
		s4.subscribeChannel(gopiwritings);
		s5.subscribeChannel(gopiwritings);
		
		gopiwritings.upload("How to learn java programming???");
	}

}

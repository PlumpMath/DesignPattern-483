package com.gmail.bbfeechen;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(10);
		} catch(InterruptedException e) {
			
		}
	}
}

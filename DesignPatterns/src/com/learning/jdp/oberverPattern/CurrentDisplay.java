package com.learning.jdp.oberverPattern;

public class CurrentDisplay implements Observer, DisplayElement {

	Data wd = new Data();
	WeatherData sub;
	
	public CurrentDisplay (WeatherData sub){
		this.sub = sub;
		sub.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Display got "
				+ wd.getHumidity() + " " + wd.getPresure() + " " + wd.getTemparature());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.wd = sub.getData();
		display();
	}

}

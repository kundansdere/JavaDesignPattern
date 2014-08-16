package com.learning.jdp.oberverPattern;

public class StatDisplay implements Observer, DisplayElement {

	Data wd = new Data();
	WeatherData sub ;
	
	public StatDisplay (WeatherData sub){
		this.sub = sub;
		sub.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stats Display got "
				+ wd.getTemparature() + " " + wd.getPresure() + " " + wd.getHumidity());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.wd = sub.getData();
		display();
	}

}

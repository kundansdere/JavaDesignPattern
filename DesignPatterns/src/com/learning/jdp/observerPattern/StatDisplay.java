package com.learning.jdp.observerPattern;

public class StatDisplay extends DisplayBehavior implements Observer {

	Data d = new Data();
	WeatherData sub ;
	
	public StatDisplay (WeatherData sub){
		this.sub = sub;
		sub.addObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.d = sub.getData();
		display(d);
	}

}

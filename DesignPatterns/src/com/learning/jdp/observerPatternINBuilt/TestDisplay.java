package com.learning.jdp.observerPatternINBuilt;

import java.util.Observable;
import java.util.Observer;

import com.learning.jdp.observerPattern.Data;
import com.learning.jdp.observerPattern.DisplayElement;

public class TestDisplay implements DisplayElement, Observer {

	Data d = new Data();
	Observable sub;
	public TestDisplay(Observable sub){
		this.sub = sub;
		sub.addObserver(this);
	}
	@Override
	public void update(Observable sub, Object arg1) {
		// TODO Auto-generated method stub
		WeatherData wd = (WeatherData) sub;
		d = wd.getData();
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Test got this" + d.getHumidity() +" " + d.getPresure() + "" + d.getTemparature());
	}

}

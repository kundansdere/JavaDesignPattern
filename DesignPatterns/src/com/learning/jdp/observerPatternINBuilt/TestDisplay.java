package com.learning.jdp.observerPatternINBuilt;

import java.util.Observable;
import java.util.Observer;

import com.learning.jdp.observerPattern.Data;
import com.learning.jdp.observerPattern.DisplayBehavior;
import com.learning.jdp.observerPattern.DisplayElement;

public class TestDisplay extends DisplayBehavior implements Observer {

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
		display(d);
	}

}

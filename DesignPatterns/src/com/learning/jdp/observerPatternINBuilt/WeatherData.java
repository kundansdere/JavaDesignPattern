package com.learning.jdp.observerPatternINBuilt;

import java.util.Observable;
import com.learning.jdp.observerPattern.*;
public class WeatherData extends Observable {
	Data data = new Data();
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void measuredChange(Data d){
		this.data = d;
		setChanged();
		notifyObservers();
	}
}

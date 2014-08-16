package com.learning.jdp.oberverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	Data data = new Data();
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	ArrayList<Observer> observers = new ArrayList<Observer>(); 
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o: observers){
			o.update();
		}
		
	}
	public void weatherChange(float temparature,float presure,float humidity){
		data.setHumidity(humidity);
		data.setPresure(presure);
		data.setTemparature(temparature);
		notifyObservers();
	}

}

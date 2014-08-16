package com.learning.jdp.observerPattern;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd = new WeatherData();
		CurrentDisplay cd = new CurrentDisplay(wd);
		StatDisplay sd = new StatDisplay(wd);
		
	
		wd.weatherChange(10, 20, 45);
		wd.weatherChange(120, 23, 45);
		CurrentDisplay kd = new CurrentDisplay(wd);
		wd.weatherChange(99, 00, 99);
	}

}

package com.learning.jdp.observerPatternINBuilt;

import com.learning.jdp.observerPattern.Data;

public class WeatherDataINBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData sub = new WeatherData();
		TestDisplay td = new TestDisplay(sub);
		Data data = new Data();
		data.setHumidity(1);
		data.setTemparature(1);
		data.setPresure(1);
		sub.measuredChange(data);
	}
	

}

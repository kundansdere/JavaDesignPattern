package com.learning.jdp.observerPattern;

public class DisplayBehavior implements DisplayElement {

	@Override
	public void display(Data d) {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + " got ->" + d.getHumidity() + " " + d.getTemparature() + " " + d.getPresure());
	}

}

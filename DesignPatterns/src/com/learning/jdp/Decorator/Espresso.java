package com.learning.jdp.Decorator;

public class Espresso extends Beverage {
	public Espresso () {
		super.description = "Espresso";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 120;
	}

}

package com.learning.jdp.Decorator;

public class Mocha extends CondimentBeverage {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 3.5;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ",Mocha";
	}

}

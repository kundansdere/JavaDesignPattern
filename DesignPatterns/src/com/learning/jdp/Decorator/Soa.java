package com.learning.jdp.Decorator;

public class Soa extends CondimentBeverage {

	Beverage beverage;
	
	public Soa(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 7.5;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ",Soa";
	}

}

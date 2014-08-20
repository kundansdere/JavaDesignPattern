package com.learning.jdp.Decorator;

public class StarBucks {
	public static void main(String [] args){
		Beverage order1 = new Espresso();
		order1 = new Mocha(order1);
		order1 = new Soa(order1);
		order1 = new Mocha(order1);
		System.out.println( order1.getDescription() + " ->" + order1.cost() );
	
		Beverage order2 = new HouseBlend();
		order2 = new Soa(order2);
		order2 = new Mocha(order2);
		System.out.println( order2.getDescription() + " ->" + order2.cost() );
	
	}
}

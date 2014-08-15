package com.learning.jdp;

public class Main {
	public static void main(String []args) {
		Duck mallared = new MallaredDuck();
		mallared.performFly();
		mallared.perfromQuack();
		
		
		Duck decoy = new WoddenDuck();
		decoy.performFly();
		decoy.perfromQuack();
	}
	
	
}

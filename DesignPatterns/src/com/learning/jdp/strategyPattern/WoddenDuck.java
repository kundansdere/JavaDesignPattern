package com.learning.jdp.strategyPattern;

public class WoddenDuck extends Duck {
	public WoddenDuck () {
		flyBehvior = new FlyWithnoWings();
		quackBehavior = new MuteQuack(); 
	}
}

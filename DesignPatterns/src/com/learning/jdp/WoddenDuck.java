package com.learning.jdp;

public class WoddenDuck extends Duck {
	public WoddenDuck () {
		flyBehvior = new FlyWithnoWings();
		quackBehavior = new MuteQuack(); 
	}
}

package com.learning.jdp.strategyPattern;

public class MallaredDuck extends Duck {
	public MallaredDuck() {
		flyBehvior = new FlyWithWings();
		quackBehavior = new QuackQuack();
	}

}

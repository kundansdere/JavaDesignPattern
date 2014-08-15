package com.learning.jdp;

public class MallaredDuck extends Duck {
	public MallaredDuck() {
		flyBehvior = new FlyWithWings();
		quackBehavior = new QuackQuack();
	}

}

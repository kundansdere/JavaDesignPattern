package com.learning.jdp.strategyPattern;

public abstract class Duck {
	FlyBehavior flyBehvior;
	QuackBehavior quackBehavior;
	
	void performFly() {
		flyBehvior.fly();
	}
	
	void perfromQuack() {
		quackBehavior.quack();
	}
}

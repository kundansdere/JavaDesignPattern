package com.learning.jdp.strategyPattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("No!! I cant Sound");
	}

}

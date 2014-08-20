package com.learning.jdp.Decorator;

public abstract class Beverage {
	String description = "Unknown Beverage";  
	public String getDescription(){
		return description;
	}
	public abstract double cost();
	
}

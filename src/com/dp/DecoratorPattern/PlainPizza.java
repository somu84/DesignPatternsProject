package com.dp.DecoratorPattern;

public class PlainPizza implements Pizza{

	@Override
	public String getDercription() {
		
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4.00;
	}

	
}

package com.dp.DecoratorPattern;

public abstract class ToppingDecorator implements Pizza {
	
	
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza plainPizza){
		tempPizza = plainPizza;
	}
	
	public String getDescription(){
		return tempPizza.getDercription();
	}
	
	public double getCost(){
		return tempPizza.getCost();
	}
}

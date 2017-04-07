package com.dp.DecoratorPattern;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza plainPizza) {
		super(plainPizza);
		
		
		System.out.println("Adding Dough");
		System.out.println("Adding Moz");
		
	}

	@Override
	public String getDercription() {
		
		return tempPizza.getDercription()+" , Mozzarella";
	}
	
	public double getCost(){
		return tempPizza.getCost() + 0.50;
	}

}

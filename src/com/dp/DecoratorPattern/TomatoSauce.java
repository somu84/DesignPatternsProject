package com.dp.DecoratorPattern;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza plainPizza) {
		super(plainPizza);
		System.out.println("Adding Tomato Sauce");
		
	}

	@Override
	public String getDercription() {
		
		return tempPizza.getDercription()+" , Tomato Sauce";
	}
	
	public double getCost(){
		return tempPizza.getCost() + 0.10;
	}

}

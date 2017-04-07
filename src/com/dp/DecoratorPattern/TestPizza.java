package com.dp.DecoratorPattern;

public class TestPizza {
	public static void main(String[] args){
		
		Pizza basic = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients : "+basic.getDercription());
		System.out.println("Total Cost : "+basic.getCost());
	}
}

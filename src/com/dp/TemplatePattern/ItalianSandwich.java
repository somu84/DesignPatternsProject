package com.dp.TemplatePattern;

public class ItalianSandwich extends Sandwich {
	
	String[] meatUsed = {"Salami", "Peproni", "Chicken"};
	String[] cheeseUsed = {"Cheese"};
	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions"};
	String[] condimentsUsed = {"Ketchup", "Mustard", "Mayo"};
	
	@Override
	void addMeat() {
		System.out.println("Adding meat ");
		for(String meat: meatUsed){
			System.out.print(meat+" ");
		}
		
	}

	@Override
	void addCheese() {
		System.out.println("\nAdding cheese ");
		for(String meat: cheeseUsed){
			System.out.print(meat+" ");
		}
		
	}

	@Override
	void addVegetables() {
		System.out.println("\nAdding vegetables ");
		for(String meat: veggiesUsed){
			System.out.print(meat+" ");
		}
		
	}

	@Override
	void addCondiments() {
		System.out.println("\nAdding condiments ");
		for(String meat: condimentsUsed){
			System.out.print(meat+" ");
		}
		
	}
	

}

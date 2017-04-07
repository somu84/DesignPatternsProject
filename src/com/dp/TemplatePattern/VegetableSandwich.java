package com.dp.TemplatePattern;

public class VegetableSandwich extends Sandwich{
	
	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions"};
	String[] condimentsUsed = {"Ketchup", "Mustard", "Mayo"};
	
	boolean customerWantsMeat(){return false;}
	boolean customerWantsCheese(){return false;}
	
	@Override
	void addMeat() {}

	@Override
	void addCheese() {}

	@Override
	void addVegetables() {
		System.out.println("Adding vegetables");
		for(String meat: veggiesUsed){
			System.out.print(meat+" ");
		}
		
	}

	@Override
	void addCondiments() {
		System.out.println("\nAdding condiments");
		for(String meat: condimentsUsed){
			System.out.print(meat+" ");
		}
		
	}
}

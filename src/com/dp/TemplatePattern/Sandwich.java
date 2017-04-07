package com.dp.TemplatePattern;

public abstract class Sandwich {
	final void makeSandwich(){
		cutBun();
		if(customerWantsMeat()){
			addMeat();
			
		}
		if(customerWantsCheese()){
			addCheese();
		}
		if(customerWantsVegetables()){
			addVegetables();
		}
		if(customerWantsCondiments()){
			addCondiments();
		}
		wrapTheSandwich();
	}
	
	
	public void cutBun(){
		System.out.println("The bread is cut");
	}
	
	public void wrapTheSandwich(){
		System.out.println("\nSandwich is wrapped");
	}
	
	
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	boolean customerWantsMeat(){return true;}
	boolean customerWantsCheese(){return true;}
	boolean customerWantsVegetables(){return true;}
	boolean customerWantsCondiments(){return true;}
	
}

package com.dp.StrategyPattern;

public class AnimalPlay {
	
	public static void main(String[] args){
		Animal dog = new Dog();
		Animal tweet = new Bird();
		
		System.out.println("Dog: "+dog.tryToFly());
		System.out.println("Bird: "+tweet.tryToFly());
		
		//Dynamically setting the class behavior
		dog.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog grows wings");
		System.out.println("Dog: "+dog.tryToFly());
		
	}

}

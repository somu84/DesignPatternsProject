package com.dp.StrategyPattern;

/**
 * The Strategy DP, lets the algorithm vary independently from the client that use it.
 * 
 * Here we had two algorithms (ItFlys and CantFly). We encapsulated them, under an interface(Flys)
 * and made them interchangeable.
 * 
 * https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLE7E8B7F4856C9B19&index=67
 * @author Somu
 *
 */
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

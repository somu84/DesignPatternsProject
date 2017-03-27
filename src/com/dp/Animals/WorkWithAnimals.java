package com.dp.Animals;

public class WorkWithAnimals {

	
	public static void main(String[] args){
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setHeight(11.5);
		
		/**
		 * Polymorphism demo
		 */
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says "+ doggy.getSound());
		System.out.println("Kitty says "+ kitty.getSound());
		
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says "+ animals[0].getSound());
		System.out.println("Kitty says "+ animals[1].getSound());
		
		speakAnimal(kitty);
		//Can't call methods of the subclass 
		((Dog)doggy).digHole();
		
		Giraffe gf = new Giraffe();
		gf.setName("Frank");
		System.out.println(gf.getName());
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says "+ randAnimal.getSound());
	}
	
}

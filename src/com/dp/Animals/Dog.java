package com.dp.Animals;

public class Dog extends Animal{
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	public Dog(){
		super();
		setSound("bark");
	}
	public void sayHello(){
		bePrivate();
	}
	private void bePrivate(){
		System.out.println("In a private method");
	}
}

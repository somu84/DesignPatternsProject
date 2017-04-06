package com.dp.AbstractFactory;

public abstract class EnemyShip {
	private String name;
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName(){ return name;}
	
	public void setName(String newName){name = newName;}
	
	abstract void makeShip();
	public String toString(){
		String infoOnShip = "The "+ name+" has a top speed of "+
				engine+ " and attack power of "+ weapon;
		return infoOnShip;
	}
	
	public void displayEnemyShip(){
		System.out.println("The "+name+" is on screen");
	}
	
	public void followHeroShip(){
		System.out.println("The "+name+" is following hero ship");
	}
	
	public void enemyShipShoots(){
		System.out.println("The "+name+" shoots on the hero ship");
	}
}

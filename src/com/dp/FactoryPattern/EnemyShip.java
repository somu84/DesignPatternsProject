package com.dp.FactoryPattern;

public abstract class EnemyShip {
	private String name;
	//private double speed;
	//private double directionX;
	//private double directionY;
	private double amtDamage;
	
	public String getName(){return name;}
	public void setName(String name){ this.name = name;}
	
	public double getDamage(){return amtDamage;}
	public void setDamage(double damage){amtDamage = damage;}
	
	public void followHeroShip(){
		System.out.println(getName()+ " is following the hero");
	}
	
	public void displayEnemyShip(){
		System.out.println(getName() + " is on screen");
	}
	
	public void enemyShipShoots(){
		System.out.println(getName()+" attacks and does "+ getDamage()+ " damage to hero");
	}
}

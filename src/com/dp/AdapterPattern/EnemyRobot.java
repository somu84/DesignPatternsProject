package com.dp.AdapterPattern;

import java.util.Random;

public class EnemyRobot {
	Random generator = new Random();
	
	public void smashWithHands(){
		int attackDamage = generator.nextInt(10)+1;
		System.out.println("Robot causes "+attackDamage+" Damage with it's hands");
	}
	
	public void walkForward(){
		int movement = generator.nextInt(5)+1;
		System.out.println("Enemy Robot walks "+movement+" distance");
	}
	
	public void reactToHuman(String driverName){
		System.out.println("Enemy robot crushes "+driverName);
	}
}

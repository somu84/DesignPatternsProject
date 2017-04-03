package com.dp.FactoryPattern;

/**
 * This is a factory thats only job is creating ships
 * By encapsulating ship creation, we only have one 
 * place to make modifications
 * @author Somu
 *
 */
public class EnemyShipFactory {

	/**
	 * This could be used as a static method, if we
	 * are willing to give up subclassing it.
	 * @param newShipType
	 * @return
	 */
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip newShip = null;
		switch(newShipType){
		case "U":
			newShip =  new UFOEnemyShip();
			break;
		case "R":
			newShip =  new RocketEnemyShip();
			break;
		case "B":
			newShip = new BigUFOEnemyShip();
			break;
		}
		return newShip;
	}
}

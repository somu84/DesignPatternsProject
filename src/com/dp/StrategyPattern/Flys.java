package com.dp.StrategyPattern;
/**
 * The interface is implemented by many other 
 * subclasses that allow for many types of flying 
 * without effecting Animal, or Flys. 
 * 
 * Classes that implement new Flys interface 
 * subclasses can allow other classes to use
 * that code eliminating code duplication. 
 * 
 * I'm decoupling : encapsulating the concept that varies
 * @author Somu
 *
 */
public interface Flys {
	
	String fly();

}


//Class used if the Animal can fly

class ItFlys implements Flys{
	
	public String fly(){
		return "Flying high";
	}
}

class CantFly implements Flys{
	
	public String fly(){
		return "Can't fly";
	}
}
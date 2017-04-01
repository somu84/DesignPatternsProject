package com.dp.ObserverPattern;

import java.util.ArrayList;

/**
 * Uses the Subject interface to update all Observers
 * @author Somu
 *
 */
public class StockGrabber implements Subject{

	private ArrayList<Observer> observers; 
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(){
		observers = new ArrayList<>();
	}
	
	public void register(Observer observer){
		this.observers.add(observer);
	}
	
	public void unregister(Observer ob){
		int obI = this.observers.indexOf(ob);
		System.out.println("Observer "+(obI+1)+" deleted");
		this.observers.remove(obI);
	}
	
	public void notifyObserver(){
		for(Observer ob: this.observers){
			ob.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setIbmPrice(double newIBMPrice){
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}
	
	public void setGoogPrice(double newGoogPrice){
		this.googPrice = newGoogPrice;
		notifyObserver();
	}
	
	public void setAaplPrice(double newAaplPrice){
		this.aaplPrice = newAaplPrice;
		notifyObserver();
	}
	
}

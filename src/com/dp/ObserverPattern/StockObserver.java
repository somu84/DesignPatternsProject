package com.dp.ObserverPattern;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	//Static used as a counter
	private static int observerIDTracker = 0;
	
	//Used to track Observers
	private int observerID;
	
	//Will hold reference to the StockGrabber object
	private Subject stockGrabber;
	
	public StockObserver (Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer: "+this.observerID);
		this.stockGrabber.register(this);
	}
	
	public void update(double ibmPrice, double aaplPrice, double googPrice){
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printPrices();
	}
	
	public void printPrices(){
		System.out.println(this.observerID+" \nIBM: "+ this.ibmPrice + 
				"\nAAPL: "+this.aaplPrice+"\nGOOG: "+this.googPrice+"\n");
	}

}

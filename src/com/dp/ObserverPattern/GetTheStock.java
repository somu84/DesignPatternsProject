package com.dp.ObserverPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

	
	private String stock;
	private double price;
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
		this.stockGrabber = stockGrabber;
		this.stock = newStock;
		this.price = newPrice;
	}
	
	public void run() {
		for(int i=1; i<=20; i++){
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			
			double rand = (Math.random()* (.06)) - (.03);
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format(this.price + rand));
			
			if(this.stock.equals("IBM")) ((StockGrabber)this.stockGrabber).setIbmPrice(price);
			if(this.stock.equals("AAPL")) ((StockGrabber)this.stockGrabber).setAaplPrice(price);
			if(this.stock.equals("GOOG")) ((StockGrabber)this.stockGrabber).setGoogPrice(price);
			
			System.out.println(this.stock+ " : "+df.format(price+rand)+" "+df.format(rand));
			System.out.println();
		}
		
	}

}

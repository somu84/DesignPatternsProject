package com.dp.Singleton;

import java.util.*;

public class ScrabbleTestThreads {

	public static void main(String[] args){
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesA = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesA).start();
	}
	
	static class GetTheTiles implements Runnable{
		public void run() {
			Singleton newInstance = Singleton.getInstance();
			System.out.println("Instance ID: "+ System.identityHashCode(newInstance));
			System.out.println(newInstance.getLetterList());
			List<String> player1 = newInstance.getTiles(7);
			System.out.println("Player : "+player1);
			System.out.println("Got tiles");
			
		}
		
	}
}

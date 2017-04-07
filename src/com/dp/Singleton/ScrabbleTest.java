package com.dp.Singleton;
import java.util.*;

public class ScrabbleTest {
	public static void main(String[] args){
		Singleton newInstance = Singleton.getInstance();
		System.out.println("Instance 1 ID: "+ System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		
		List<String> player1Tiles = newInstance.getTiles(7);
		System.out.println("Player1: "+player1Tiles);
		System.out.println(newInstance.getLetterList());
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("Instance 2 ID: "+ System.identityHashCode(instance2));
		System.out.println(instance2.getLetterList());
		List<String> player2Tiles = instance2.getTiles(7);
		System.out.println("Player2: "+player2Tiles);
		System.out.println(instance2.getLetterList());
	}
}

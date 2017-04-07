package com.dp.PrototypePattern;

public class CloneFactory {
	public Animal getClone(Animal animalSample){
		
		return animalSample.makeCopy();
	}

}

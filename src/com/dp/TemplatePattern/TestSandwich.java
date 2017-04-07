package com.dp.TemplatePattern;

public class TestSandwich {
	public static void main(String[] args){
		Sandwich v = new VegetableSandwich();
		Sandwich i = new ItalianSandwich();
		System.out.println("Vegetable Sandwich");
		v.makeSandwich();
		System.out.println();
		System.out.println("Italian Sandwich");
		i.makeSandwich();
		
	}

}

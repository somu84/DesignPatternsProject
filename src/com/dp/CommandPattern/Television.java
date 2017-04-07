package com.dp.CommandPattern;

public class Television implements ElectronicDevice{
	
	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");
	}

	@Override
	public void volumeUp() {
		++volume;
		System.out.println("TV volumne is at " + volume);
	}

	@Override
	public void voulmeDown() {
		--volume;
		System.out.println("TV volumne is at " + volume);
	}

}

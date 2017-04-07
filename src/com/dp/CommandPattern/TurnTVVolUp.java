package com.dp.CommandPattern;

public class TurnTVVolUp implements Command{
	
	ElectronicDevice theDevice;
	
	public TurnTVVolUp(ElectronicDevice newDevice){
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.volumeUp();
	}

	@Override
	public void undo() {
		theDevice.voulmeDown();
		
	}
	
	

}
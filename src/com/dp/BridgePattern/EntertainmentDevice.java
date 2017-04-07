package com.dp.BridgePattern;

public abstract class EntertainmentDevice {
	
	public int deviceState;
	
	public int maxSetting;
	
	public int volLevel = 0;
	
	public abstract void buttonFivePressed();
	public abstract void buttonSixPressed();

	public void deviceFeedback(){
		if(deviceState > maxSetting || deviceState < 0){
			deviceState = 0;
		}
		System.out.println("On "+deviceState);
	}
	
	public void buttonSevenPressed(){
		volLevel++;
		System.out.println("Volume at: "+volLevel);
	}
	
	public void buttonEightPressed(){
		volLevel--;
		System.out.println("Volume at: "+volLevel);
	}
}

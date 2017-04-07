package com.dp.BridgePattern;

public class TVDevice extends EntertainmentDevice {
	
	
	public TVDevice(int newDeviceState, int maxSet) {
		deviceState = newDeviceState;
		maxSetting = maxSet;
	}
	
	@Override
	public void buttonFivePressed() {
		System.out.println("Channel Down");
		deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Channel Up");
		deviceState++;
	}
	
	

}

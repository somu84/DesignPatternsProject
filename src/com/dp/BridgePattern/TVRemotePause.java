package com.dp.BridgePattern;

public class TVRemotePause extends RemoteButton{

	public TVRemotePause(EntertainmentDevice dev) {
		super(dev);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV Paused");
		
	}

}

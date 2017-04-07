package com.dp.BridgePattern;

public class TVRemoteMuteButton extends RemoteButton {

	public TVRemoteMuteButton(EntertainmentDevice dev) {
		super(dev);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV muted");
		
	}

}

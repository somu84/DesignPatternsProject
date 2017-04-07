package com.dp.BridgePattern;

public class TestRemote {
	
	public static void main(String[] args){
		RemoteButton theTV = new TVRemoteMuteButton(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		
		System.out.println("Test TV with Mute");
		theTV.buttonFivePressed();
		theTV.buttonNinePressed();
		theTV.buttonSixPressed();
		
		System.out.println("Test TV with Pause");
		theTV2.buttonFivePressed();
		theTV2.buttonNinePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.deviceFeedback();
	}

}

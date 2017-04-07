package com.dp.CommandPattern;

import java.util.*;

public class PlayWithRemote {
	
	public static void main(String[] args){
		ElectronicDevice newDevice = TvRemote.getDevice();
		List<DeviceButton> listCommand = new ArrayList<>();
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		listCommand.add(onPressed);
		onPressed.press();
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		onPressed = new DeviceButton(offCommand);
		listCommand.add(0, onPressed);
		onPressed.press();
		
		TurnTVVolUp volUpCommand = new TurnTVVolUp(newDevice);
		onPressed = new DeviceButton(volUpCommand);
		onPressed.press();
		listCommand.add(0, onPressed);
		onPressed.press();
		listCommand.add(0, onPressed);
		onPressed.press();
		listCommand.add(0, onPressed);
		
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<>();
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff allOffCommand = new TurnItAllOff(allDevices);
		onPressed = new DeviceButton(allOffCommand);
		onPressed.press();
		listCommand.add(0, onPressed);
		
		for(DeviceButton dB: listCommand){
			dB.pressUndo();
		}
	}

}

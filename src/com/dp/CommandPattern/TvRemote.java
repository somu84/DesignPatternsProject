package com.dp.CommandPattern;

public class TvRemote {
	
	public static ElectronicDevice getDevice(){
		return new Television();
	}

}

package com.dp.FacadePattern;

public class SecurityCodeCheck {
	private int securityCode = 1234;
	
	public int getSecurityCode(){return securityCode;}
	
	public boolean isCodeCorrect(int sec){
		if(sec == getSecurityCode()){
			return true;
		}
		return false;
	}

}

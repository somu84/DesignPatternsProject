package com.dp.FacadePattern;

public class AccountNumberCheck {
	
	
	private int accountNumber = 12345678;
	public int getAccountNumber(){return accountNumber;}
	
	public boolean accountActive(int acc){
		if(acc == getAccountNumber()){
			return true;
		}
		return false;
	}
}

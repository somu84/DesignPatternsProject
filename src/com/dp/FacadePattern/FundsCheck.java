package com.dp.FacadePattern;

public class FundsCheck {
	
	private double cashInAcc = 1000.0;
	
	public double getCashInAccount() { return cashInAcc;}
	
	public void decreaseCashInAccount(double amt){
		cashInAcc -= amt;
	}

	public void increaseCashInAccount(double amt){
		cashInAcc += amt;
	}
	
	public boolean haveEnoughMoney(double amt){
		if(cashInAcc >= amt) {
			decreaseCashInAccount(amt);
			System.out.println("Success!! \nCurrent Balance: "+cashInAcc);
			return true;
		}else{
			System.out.println("Insufficient funds!!!");
			System.out.println("Current Balance: "+cashInAcc);
			return false;
		}
	}
	
	public void depositMoney(double amt){
		increaseCashInAccount(amt);
		System.out.println("Cash deposited!!\nCurrent Balance: "+cashInAcc);
	}
}

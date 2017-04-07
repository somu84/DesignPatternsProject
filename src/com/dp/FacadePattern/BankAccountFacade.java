package com.dp.FacadePattern;

public class BankAccountFacade {
	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int newAcc, int newSec){
		this.accountNumber = newAcc;
		this.securityCode = newSec;
		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber(){return accountNumber;}
	
	public int getSecurityCode(){return securityCode;}
	
	public void withDrawCash(double cashToGet){
		if(acctChecker.accountActive(accountNumber)
				&& codeChecker.isCodeCorrect(securityCode)){
			fundChecker.haveEnoughMoney(cashToGet);
			System.out.println("Transaction Complete!!\n");
		}else{
			System.out.println("Transaction Failed !!!\n");
		}
	}
	
	public void depositCash(double amt){
		if(acctChecker.accountActive(accountNumber)
				&& codeChecker.isCodeCorrect(securityCode)){
			fundChecker.depositMoney(amt);;
			System.out.println("Transaction Complete!!\n");
		}else{
			System.out.println("Transaction Failed !!!\n");
		}
	}
}

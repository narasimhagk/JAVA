package com.atm;
import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;
public class Account {
	Scanner s=new Scanner(System.in);
	DecimalFormat moneyFor=new DecimalFormat("'$'###,##0.00");
	/* Set customer Number*/
	private int customerNumber;
	private int pinNumber;
	private double currentAccount=0;
	private double savingAccount=0;
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCurentaccount() {
		return currentAccount;
	}
	public void setCurrentAccount(double currentAcc) {
		this.currentAccount = currentAcc;
	}
	public double getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(double savingAcc) {
		this.savingAccount = savingAcc;
	}
	/* Calculate Checking Account withdrawal*/
	public double calCurrentAccount(double amount) {
		currentAccount=(currentAccount-amount);
		return currentAccount;
	}
	/* Calculate checking Saving Account withdraw  */
	public double calSavingAccountWithdraw1(double amount) {
		savingAccount=(savingAccount-amount);
		return savingAccount;
	}
	/* calculate Current Account deposit */
	public double calCurrentAccountDeposit(double amount) {
		currentAccount=(currentAccount+amount);
		return currentAccount;
	}
	/* Calculate checking Saving Account deposit  */
	public double calSavingAccountDeposit(double amount) {
		savingAccount=(savingAccount+amount);
		return savingAccount;
	}
	public void currentAccountWithdrawInput() {
		
		System.out.println("Checking Current Account Balance:"+moneyFor.format(currentAccount));
		System.out.println("Account you want to withdraw from Current Account:");
		double amount=s.nextDouble();
		
		if((currentAccount-amount)>=0) {
			calCurrentAccount(amount);
			System.out.println("New Current Account balance:"+moneyFor.format(currentAccount));
		}
		else {
			System.out.println("Balance cannot be neagtive"+"\n");
		}
	}
public void currentAccountDepositInput() {
		
		System.out.println("Checking Current Account Balance:"+moneyFor.format(currentAccount));
		System.out.println("Account you want to Deposit from Current Account:");
		double amount=s.nextDouble();
		
		if((currentAccount+amount)>=0) {
			calCurrentAccountDeposit(amount);
			System.out.println("New Current Account balance:"+moneyFor.format(currentAccount));
		}
		else {
			System.out.println("Balance cannot be neagtive"+"\n");
		}
	}
	public void savingAccountWithdrawInput() {
		System.out.println("Checking Savings Account Balance:"+moneyFor.format(savingAccount));
		System.out.println("Account you want to withdraw from Saving Account:");
		double amount=s.nextDouble();
		
		if((savingAccount-amount)>=0) {
			calSavingAccountWithdraw1(amount);
			System.out.println("New Savings Account balance:"+moneyFor.format(savingAccount));
		}
		else {
			System.out.println("Balance cannot be neagtive"+"\n");
		}
	}
	public void savingAccountDepositInput() {
		System.out.println("Checking Savings Account Balance:"+moneyFor.format(savingAccount));
		System.out.println("Account you want to Deposit from Saving Account:");
		double amount=s.nextDouble();
		
		if((savingAccount+amount)>=0) {
			calSavingAccountDeposit(amount);
			
			System.out.println("New Savings Account balance:"+moneyFor.format(savingAccount));
		}
		else {
			System.out.println("Balance cannot be neagtive"+"\n");
		}
	}
	
}

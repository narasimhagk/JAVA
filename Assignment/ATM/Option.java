package com.atm;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.text.DecimalFormat;
public class Option extends Account {
	Scanner menu=new Scanner(System.in);
	DecimalFormat moneyFor=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(30199,9090);
				data.put(63010,8989);
				System.out.println("welcome to the ATM project!");
				System.out.println("Enter the Customer Number:");
				setCustomerNumber(menu.nextInt());
				System.out.println("Enter u r pin number:");
				setPinNumber(menu.nextInt());
			}
			catch(Exception e) {
				System.out.println("\n"+"Invalid Character(s).Only Number."+"\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry:data.entrySet()) {
				if(entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber());
				getAccountType();
			}System.out.println("\n"+"Wrong Customer Number or Pin Number."+"\n");
		}while(x==1);
		
	}
	public void getAccountType() {
		System.out.println("Select the Account you want to Access: ");
		System.out.println("Type-1 Current Account");
		System.out.println("Type-2 Saving Account");
		System.out.println("Type-1 Exit");
		System.out.println("Choice:");
		selection=menu.nextInt();
		
		switch(selection) {
		case 1:
			getCurrent();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank You");
			break;
			default:
				System.out.println("\n"+"Invalid Choice"+"\n");
				getAccountType();
		}
	}
	public void getCurrent() {
		System.out.println("Current Account:");
		System.out.println("Type-1 View Balance");
		System.out.println("Type-2 Withdraw Funds");
		System.out.println("Type-3 Deposit Funds");
		System.out.println("Type-4 Exit");
		System.out.println("Choice:");
	

		selection=menu.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance:"+moneyFor.format(getCurentaccount()));
			getAccountType();
			break;
		case 2:
			currentAccountWithdrawInput();
			getAccountType();
			break;
		case 3:
			currentAccountDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye");
			getCurrent();
		default :
			System.out.println("\n"+"Invalid choice."+"\n");
			getCurrent();
		}
		}

	
	public void getSaving() {
		System.out.println("Saving Account:");
		System.out.println("Type-1 View Balance");
		System.out.println("Type-2 Withdraw Funds");
		System.out.println("Type-3 Deposit Funds");
		System.out.println("Type-4 Exit");
		System.out.println("Choice:");
	

		selection=menu.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance:"+moneyFor.format(getSavingAccount()));
			getAccountType();
			break;
		case 2:
			savingAccountWithdrawInput();
			getAccountType();
			break;
		case 3:
			savingAccountDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye");
			getSaving();
		default :
			System.out.println("\n"+"Invalid choice."+"\n");
			getSaving();
		}
		}
	int selection;

}

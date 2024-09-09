package com.Bank;

public class STATEBank implements SBIBank,KOTAKBank{
	
	static int user_balance = 10000;
	static int ATMBalance = 20000;

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
//		System.out.println("The balance is : "+balance);
		System.out.println("The check balance method of class STATEBank");
		
		
	}

	@Override
	public int withDraw(int amt) {
		if(STATEBank.ATMBalance>=user_balance) {
		if(user_balance>=amt && amt>0) {
			user_balance = user_balance - amt;
			ATMBalance = ATMBalance - amt;
			return user_balance;
		}
					System.out.println("Enter the valid amt");

		}
		System.out.println("No money in atm!!");
		return 0;
		
	}
		
	}

	



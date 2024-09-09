package com.Bank;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		STATEBank b1 = new STATEBank();
//		b1.checkBalance();
		
		
		
		//Dynamic Dispatch
		System.out.println("--------Dynamic Dispatch-----------");
		System.out.println("-----------------SBI User1-----------------");
		SBIBank sbiuser1 = new STATEBank();
		System.out.println("The AMT Balance is : "+STATEBank.ATMBalance);
//		sbi.checkBalance();
		System.out.println("The SBI user1 balance : "+STATEBank.user_balance);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the withDrawal Amount : ");
		int ammt = sc1.nextInt();
		System.out.println("The user_balance is : "+sbiuser1.withDraw(ammt));
		
		System.out.println("--------------------------------------------");
		System.out.println("-----------------SBI User2-----------------");

		
		SBIBank sbiuser2 = new STATEBank();
		System.out.println("The AMT Balance is : "+STATEBank.ATMBalance);
//		sbi.checkBalance();
		System.out.println("The SBI user2 balance : "+STATEBank.user_balance);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the withDrawal Amount : ");
		int amt = sc2.nextInt();
		System.out.println("The user_balance is : "+sbiuser2.withDraw(amt));
		
		System.out.println("--------------------------------------------");

		
		
		KOTAKBank ktk = new STATEBank();
		System.out.println("The AMT Balance is : "+STATEBank.ATMBalance);
//		ktk.checkBalance();
		System.out.println("The KOTAK user3 balance : "+STATEBank.user_balance);
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter the withDrawal Amount : ");
		int amt1 = sc2.nextInt();
		System.out.println("The user_balance is : "+sbiuser2.withDraw(amt1));
		
	}

}

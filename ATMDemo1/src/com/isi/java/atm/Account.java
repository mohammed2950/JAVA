package com.isi.java.atm;

public class Account
{
	 private  static double  accbalance = 0;
	
	 public double getbalance()
	 {
		 
		 return accbalance;
	 }
	
	 public static  void deposit(double depositAmount)
	 
	 {
		 accbalance = accbalance+depositAmount;
		 ATMWindow.sucessMessage("DEPOSIt");
		 
	 }
	
 public static  void withdraw(double withdraw)
 {
	 
	if(withdraw <= accbalance)
	{
		
		 accbalance = accbalance-withdraw;
		 ATMWindow.sucessMessage("withdraw");
	 }
	else
	{
		ATMWindow.insufficientfunds();
		
	}
 
	}
}

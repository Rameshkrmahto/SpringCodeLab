 package com.nit.Banks;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements Bank {

	private double balance;
	
	@Override
	public double getAmount() {
		
		return balance;
	}

	@Override
	public void setAmount(double amount) {
		
		this.balance=amount;

	}

	@Override
	public String deposite(double amount) {
		
		balance=balance+amount;
		
		return "Deposite Sucessfull: "+balance;
	}

	@Override
	public String withdraw(double amount) {
		if(balance<amount)
		{
			return "Insufficient Amount In your Account";
		}
		balance=balance-amount;
		return "Withdraw Sucessful: "+balance;
	}
	
	@Override
	public String toString()
	{
		return "Welcome to HDFC\nCurrent Account Balance: "+balance;
	}

}

package com.nit.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("acc")
@Scope("singleton")
public class AccountBalanceManager {
	
	
	
	private double balance;
	

	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public void updateBalance(double amount)
	
	{
		setBalance((getBalance()+amount));
		System.out.println("Updated Balance :"+getBalance());
	}
	

}

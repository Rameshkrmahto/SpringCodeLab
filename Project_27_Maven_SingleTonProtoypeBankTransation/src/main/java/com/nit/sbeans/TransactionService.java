package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ts")
@Scope("prototype")
public class TransactionService {
	
	@Autowired
    	
	AccountBalanceManager accountBalnce;

	public void processTransaction(String type, double amount)
	{
		if(amount<0)
		{
		 throw new  IllegalArgumentException("invalid Input");
		}
		
		if(type.equalsIgnoreCase("withdraw"))
		{
			double amount1=accountBalnce.getBalance()-amount;
			accountBalnce.setBalance(amount1);
			System.out.println("Transaction successful withdraw");
			System.out.println("Balance: "+(accountBalnce.getBalance()));
		}
		
		else if(type.equalsIgnoreCase("deposite"))
		{
			double amount1=accountBalnce.getBalance()+amount;
			accountBalnce.setBalance(amount1);
			System.out.println("Transaction successful deposite");
			System.out.println("Balance: "+(accountBalnce.getBalance()));

		}
		
		else
		{
			System.out.println("Transaction fail");
		}
	}
	

}

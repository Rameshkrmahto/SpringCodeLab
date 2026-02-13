package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.AccountBalanceManager;
import com.nit.sbeans.TransactionService;

@Configuration
@ComponentScan("com.nit.sbeans")
public class AppConfig {
	
	
	@Bean("acc")
	public AccountBalanceManager display()
	{
		AccountBalanceManager acc=new AccountBalanceManager();
		
		acc.setBalance(50000);
		//acc.setAmount(20000);
		
		return acc;
	}
	
//	@Bean("ts")
//	public TransactionService transactionDisplay()
//	{
//		TransactionService t1=new TransactionService();
//		// t1.processTransaction("withdraw",5000);
//		 return t1;
//	}
//	
	

}

package com.nit.BankFactory;

import com.nit.Banks.Bank;

public interface BankFactory {
	
	
	public  Bank createBank(String bankType);
	

}

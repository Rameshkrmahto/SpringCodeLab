package com.nit.BankFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.Banks.Bank;
import com.nit.Banks.HDFC;
import com.nit.Banks.SBI;
@Component
public class ConcreteBankFactory implements BankFactory {
	
	@Autowired
	SBI sbi;
	
	@Autowired
	HDFC hdfc;
	@Override
	public Bank createBank(String bankType)
	{
		if(bankType.equals("hdfc")) {
			return hdfc;
		}else {
			return sbi;
		}
		
		
	}

}

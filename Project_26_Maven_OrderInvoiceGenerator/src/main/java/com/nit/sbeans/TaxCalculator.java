package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {
	
	
	public double calculateTax(double amount)
	{
		return amount*0.18;
	}

}

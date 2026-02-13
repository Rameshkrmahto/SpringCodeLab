package com.nit.biils;


import org.springframework.stereotype.Component;

import com.nit.sbeans.DiscountStrategy;

@Component
public class BillingService {
	
	
	DiscountStrategy discountStrategy;
	
	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}


	public String generateBill(double amount)
	{
		double discount=discountStrategy.calculationDiscount(amount);
		return "Original Amount: ₹"+amount+"\nDiscount Applied: ₹"+discount+"\nFinal Payable Amount: ₹"+(amount-discount);
		
	}

}

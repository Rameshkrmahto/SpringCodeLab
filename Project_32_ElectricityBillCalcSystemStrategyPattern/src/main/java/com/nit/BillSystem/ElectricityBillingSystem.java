package com.nit.BillSystem;


import org.springframework.stereotype.Component;

import com.nit.sbeans.BillingStrategy;

@Component
public class ElectricityBillingSystem {
	
	
	BillingStrategy billingStrategy;
	
	
	
	public void setBillingStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}



	public void showBill(double units)
	{
		System.out.println("Customer Type: "+billingStrategy);
		System.out.println("Rate per Unit: ₹"+billingStrategy.rate());
		System.out.println("Enter total units consumed: ₹"+billingStrategy.calculateBill(units));
	}

}

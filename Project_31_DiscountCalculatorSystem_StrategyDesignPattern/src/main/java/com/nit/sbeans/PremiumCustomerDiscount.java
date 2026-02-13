package com.nit.sbeans;

public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculationDiscount(double amount) {
		
		return 0.1*amount;
	}

}

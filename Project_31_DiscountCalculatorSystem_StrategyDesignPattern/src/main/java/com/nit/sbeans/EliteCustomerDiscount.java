package com.nit.sbeans;

public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculationDiscount(double amount) {
		
		return 0.15*amount;
	}

}

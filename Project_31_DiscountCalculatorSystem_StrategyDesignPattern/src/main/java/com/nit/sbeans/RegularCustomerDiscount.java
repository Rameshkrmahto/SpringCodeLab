package com.nit.sbeans;

public class RegularCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculationDiscount(double amount) {
		
		return 0.05*amount;
	}

}

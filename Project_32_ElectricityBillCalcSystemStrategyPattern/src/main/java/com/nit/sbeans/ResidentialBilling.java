package com.nit.sbeans;

public class ResidentialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		
		return 5*units;
	}

	
	
	@Override
	public String toString() {
		return "Residential Billing";
	}



	@Override
	public double rate() {
		
		return 5;
	}

	
}

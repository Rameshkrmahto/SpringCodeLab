package com.nit.sbeans;

public class CommercialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		return 8*units;
	}
	
	

	@Override
	public String toString() {
		return "Commercial Billing";
	}



	@Override
	public double rate() {
		
		return 8;
	}

	
}

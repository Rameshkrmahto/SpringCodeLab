package com.nit.sbeans;

public class IndustrialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		return 10*units;
	}

	
	
	@Override
	public String toString() {
		return "Industrial Billing";
	}



	@Override
	public double rate() {
		
		return 10;
	}
	
	

}

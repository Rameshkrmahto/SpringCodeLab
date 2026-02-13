package com.nit.sbeans;

public interface BillingStrategy {

	public double calculateBill(double units);
	public double rate();
}

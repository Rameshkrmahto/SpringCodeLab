package com.nit.sbeans;

public class ParkingFeeCalculator {
	
	 int hourPraked;
	double ratePerHour;
	
	
	public ParkingFeeCalculator(int hourPraked, double ratePerHour) {
		
		this.hourPraked = hourPraked;
		this.ratePerHour = ratePerHour;
	}
	
	
	public double calculateBill()
	{
		return hourPraked*ratePerHour;
	}
	
	

}

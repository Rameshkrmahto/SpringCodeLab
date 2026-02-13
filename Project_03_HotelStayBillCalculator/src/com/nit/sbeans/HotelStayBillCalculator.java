package com.nit.sbeans;

public class HotelStayBillCalculator {

	
	int daysStay;
	double pricePerDay;
	
//	public int getDaysStay() {
//		return daysStay;
//	}
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
//	public double getPricePerDay() {
//		return pricePerDay;
//	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public double calculateStayBill()
	{
		return daysStay*pricePerDay;
	}
}

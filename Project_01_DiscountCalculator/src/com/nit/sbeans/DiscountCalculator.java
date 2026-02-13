package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	
	double price;
	private LocalDate currentDate;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	
	public String calculateDiscount()
	{
		DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
		
		String day=dayOfWeek.toString();
		if(day=="STAURDAY" && day=="SUNDAY")
		{
			return "Discounted Price: Rs. "+(price-price*0.2)+" (20% discount applied)";
		}
		else
		{
			return "Discounted Price: Rs. "+(price-price*0.1)+" (10% discount applied)";	
		}
	}


	
	
	

}

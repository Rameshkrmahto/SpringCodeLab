package com.nit.components;

import org.springframework.stereotype.Component;

//@Component("rbg")
public class RestaurantBillGenerator {
	
	double foodAmount;
	double drinkAmount;
	double serviceCharge;
	double gstPercentage;
	

	public void setFoodAmount(double foodAmount) {
		this.foodAmount = foodAmount;
	}

	public void setDrinkAmount(double drinkAmount) {
		this.drinkAmount = drinkAmount;
	}


	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}



	public void setGstPercentage(double gstPercentage) {
		this.gstPercentage = gstPercentage;
	}


	public double gentrateFinalBill()
	{
		double baseAmount=foodAmount+drinkAmount+serviceCharge;
		double gst=baseAmount*(gstPercentage/100);
		return  baseAmount+gst;
		
		
	}
	
	

}

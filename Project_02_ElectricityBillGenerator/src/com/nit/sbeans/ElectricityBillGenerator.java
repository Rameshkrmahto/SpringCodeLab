package com.nit.sbeans;

public class ElectricityBillGenerator {
	
	private int unitConsumed;
	private double perUnitPrice;
	
	
	
	public int getUnitConsumed() {
		return unitConsumed;
	}



	public void setUnitConsumed(int unitConsumed) {
		this.unitConsumed = unitConsumed;
	}



	public double getPerUnitPrice() {
		return perUnitPrice;
	}



	public void setPerUnitPrice(double perUnitPrice) {
		this.perUnitPrice = perUnitPrice;
	}



	public double generateElectricBill()
	{
		return unitConsumed*perUnitPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.nit.sbeans;

public class MeterReading {
	
	
	private int unitConsumed;
	private double costPerPrice;
	public MeterReading(int unitConsumed, double costPerPrice) {
		super();
		this.unitConsumed = unitConsumed;
		this.costPerPrice = costPerPrice;
		System.out.println("MeterReading::0 param constructor");
	}
	public int getUnitConsumed() {
		return unitConsumed;
	}
	public void setUnitConsumed(int unitConsumed) {
		this.unitConsumed = unitConsumed;
	}
	public double getCostPerPrice() {
		return costPerPrice;
	}
	public void setCostPerPrice(double costPerPrice) {
		this.costPerPrice = costPerPrice;
	}
	
	
	
	
	

}

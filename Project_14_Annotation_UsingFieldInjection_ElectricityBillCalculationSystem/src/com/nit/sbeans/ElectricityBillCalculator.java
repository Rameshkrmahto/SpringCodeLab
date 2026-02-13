package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElectricityBillCalculator {
	
	
	
	public ElectricityBillCalculator() {
		System.out.println("ElectricityBillCalculator:0_param_Contructor");
	}

	@Autowired
	MeterReading meterReading;
	
	public double calculateBill()
	{
		return meterReading.getUnitConsumed()*meterReading.getCostPerPrice();
	}

}

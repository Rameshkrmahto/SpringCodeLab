package com.nit.sbeans;

public class InternetUsageBillCalculator {
	
	DataUsageDetails dataUsageDetails;
	double fixedMonthlyCharge;
	
	public InternetUsageBillCalculator(DataUsageDetails dataUsageDetails, double fixedMonthlyCharge) {
		
		this.dataUsageDetails = dataUsageDetails;
		this.fixedMonthlyCharge = fixedMonthlyCharge;
	}

	public double generateBill()
	{
		return ((dataUsageDetails.costPerGB*dataUsageDetails.dataInGB)+fixedMonthlyCharge);
	}
	
	
	
	
	
	

}

package com.nit.sbeans;

public class HospitalBillingSystem {
	
	TreatmentDetails treatmentDetails;
	RoomDetails roomDetails;
	
	double serviceTaxPercentage;

	public HospitalBillingSystem(TreatmentDetails treatmentDetails, RoomDetails roomDetails,
			double serviceTaxPercentage) {
		
		this.treatmentDetails = treatmentDetails;
		this.roomDetails = roomDetails;
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	
	public double generateFinalBill()
	{
		double treatBill=treatmentDetails.consultationFee+treatmentDetails.medicineCharges;
		double roomCost=roomDetails.roomChargePerDay*roomDetails.numberDays;
		
		double total=treatBill+roomCost;
		
		total+=(total*serviceTaxPercentage/100);
		
		return total;
	}
	

}

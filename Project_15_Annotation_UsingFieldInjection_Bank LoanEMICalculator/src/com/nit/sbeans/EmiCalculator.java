package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmiCalculator {
	
	//Field Injection
//	@Autowired
	LoanDetails loanDetails;
	
	//Setter injection
//	@Autowired
//	public void setLoanDetails(LoanDetails loanDetails) {
//		this.loanDetails = loanDetails;
//	}
	
	//Constructor injection
   // @Autowired
	public EmiCalculator(@Autowired LoanDetails loanDetails) {
		
		this.loanDetails = loanDetails;
	}

	public double calculateEmi()
	{
		double p=loanDetails.getLoanAmount();
		double r=(loanDetails.getAnnualInterestRate()/ 12) / 100;
		double t=loanDetails.getTenureInMonths();
	    double total=(p*r*Math.pow(1+r,t))/(Math.pow(1+r, t)-1);
	
			
	     return total;
	}

	
	

}

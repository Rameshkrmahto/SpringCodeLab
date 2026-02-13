package com.nit.sbeans;

public class LoanDetails {
	
	private double loanAmount;
	private double annualInterestRate;
	private int tenureInMonths;
	
	
	public LoanDetails() {


		System.out.println("LoanDetails:0 param contructor");
	}


	public LoanDetails(double loanAmount, double annualInterestRate, int tenureInMonths) {
		
		this.loanAmount = loanAmount;
		this.annualInterestRate = annualInterestRate;
		this.tenureInMonths = tenureInMonths;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public int getTenureInMonths() {
		return tenureInMonths;
	}


	public void setTenureInMonths(int tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}
	
	
	
	
	

}

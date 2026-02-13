package com.nit.sbeans;

public class EventTicketRevenueCalculator {
	
	int vipTickets;
	int regularTickets;
	double vipTicketPrice;
	double regularTicketPrice;
	
	public EventTicketRevenueCalculator(int vipTickets, int regularTickets, double vipTicketPrice,
			double regularTicketPrice) {
		
		this.vipTickets = vipTickets;
		this.regularTickets = regularTickets;
		this.vipTicketPrice = vipTicketPrice;
		this.regularTicketPrice = regularTicketPrice;
	}
	
	public double calculateTotalRevenue()
	{
		return ((vipTickets*vipTicketPrice)+(regularTickets*regularTicketPrice));
	}
	

}

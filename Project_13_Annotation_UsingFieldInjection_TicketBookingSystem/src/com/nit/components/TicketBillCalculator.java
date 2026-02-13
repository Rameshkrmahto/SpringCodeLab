package com.nit.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TicketBillCalculator {
	
	
	@Autowired
	TicketDetails ticketDetails;
	
	
	
	public TicketBillCalculator(TicketDetails ticketDetails) {
		
		this.ticketDetails = ticketDetails;
	}



	public double calculateTotalAmount()
	{
		double ticketTax=(ticketDetails.getTicketPrice()*ticketDetails.getNoOfTickets())*ticketDetails.getEntertainmentTaxPercentage()/100.0;
		double amount=(ticketDetails.getTicketPrice()*ticketDetails.getNoOfTickets())+ticketTax;
		
		return amount;
	}

}

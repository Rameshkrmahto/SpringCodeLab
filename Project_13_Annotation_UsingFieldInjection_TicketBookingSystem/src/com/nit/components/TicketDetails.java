package com.nit.components;

public class TicketDetails {
	
	private double ticketPrice;
	private int noOfTickets;
	private double entertainmentTaxPercentage;
	
	
	
	public TicketDetails(double ticketPrice, int noOfTickets, double entertainmentTaxPercentage) {
		
		this.ticketPrice = ticketPrice;
		this.noOfTickets = noOfTickets;
		this.entertainmentTaxPercentage = entertainmentTaxPercentage;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getEntertainmentTaxPercentage() {
		return entertainmentTaxPercentage;
	}
	public void setEntertainmentTaxPercentage(double entertainmentTaxPercentage) {
		this.entertainmentTaxPercentage = entertainmentTaxPercentage;
	}
	
	
	
	
	

}

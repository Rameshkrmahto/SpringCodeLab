package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvoiceService {
	
	@Autowired
	TaxCalculator taxCalculator;
	
	@Autowired
	Product product;
	
	public void printInvoice()
	{
		double total=product.getPrice()*product.getQuantity();
		double tax=taxCalculator.calculateTax(total);
		double finalAmount=total+tax;
		
		System.out.println("Invoice:");
		System.out.println("Product: "+product.getName());
		System.out.println("Quantity: "+product.getQuantity());
		System.out.println("Total (before tax): "+total);
		System.out.println("Tax: "+finalAmount);
	}

}

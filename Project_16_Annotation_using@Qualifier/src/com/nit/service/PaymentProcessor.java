package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("p")
public class PaymentProcessor {
	
	@Autowired
	@Qualifier("card")
	PaymentService paymentService;
	

	public PaymentProcessor () {
		
		System.out.println("PaymentProcessor.PaymentProcessor()");
	}
//	
//	
//	@Autowired
//	public PaymentProcessor(@Qualifier("card")PaymentService paymentService) {
//		super();
//		this.paymentService = paymentService;
//	}
//		
	
	
	public void Paymentmode()
	{
		paymentService.pay();
	}




	

}

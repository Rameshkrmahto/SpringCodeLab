package com.nit.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("card")
@Lazy(true)
public class CardPaymentService implements PaymentService{

	
	
	public CardPaymentService() {
		
	System.out.println("CardPaymentService:0-param constructor");
	}

	@Override
	public void pay() {
		
		System.out.println("Pay using Card");
		
	}
	
	 

}

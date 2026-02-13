package com.nit.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("upi")
@Lazy(true)
public class UPIPaymentService implements PaymentService{

	
	public UPIPaymentService() {
		System.out.println("UPIPaymentService:0 param constructor");
	}

	@Override
	public void pay() {
		
		System.out.println("Pay using UPI");
		
	}

}

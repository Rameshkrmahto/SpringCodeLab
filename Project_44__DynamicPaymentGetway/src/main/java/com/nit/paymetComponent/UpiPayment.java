package com.nit.paymetComponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPayment implements PaymentStrategy {

	@Value("${payment.upi.base}")
	private int base;
	
	@Value("${payment.upi.percentage}")
	private double rate;
	
	@Override
	public double calculateFee(double amount) {
		
		
		return (rate/100)*amount+base;
	}

}

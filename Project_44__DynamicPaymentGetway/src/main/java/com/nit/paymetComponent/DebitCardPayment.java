package com.nit.paymetComponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCardPayment implements PaymentStrategy {

	@Value("${payment.debit.base}")
	private int base;
	
	@Value("${payment.debit.percentage}")
	private double rate;
	
	@Override
	public double calculateFee(double amount) {
		
		return (rate/100)*amount+base;
	}

}

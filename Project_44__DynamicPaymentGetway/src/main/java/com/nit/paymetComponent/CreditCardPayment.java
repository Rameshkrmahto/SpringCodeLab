package com.nit.paymetComponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements PaymentStrategy {

	@Value("${payment.credit.base}")
	private Integer base;
	
	@Value("${payment.credit.percentage}")
	private Double rate;
	
	@Override
	public double calculateFee(double amount) {
		
		return (rate/100)*amount+base;
	}

}

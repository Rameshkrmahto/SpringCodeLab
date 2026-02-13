package com.nit.servicePayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.paymetComponent.CreditCardPayment;
import com.nit.paymetComponent.DebitCardPayment;
import com.nit.paymetComponent.PaymentStrategy;
import com.nit.paymetComponent.UpiPayment;

@Service("payservice")
public class PaymentService {
	
	@Autowired
	CreditCardPayment creditPayment;
	
	@Autowired
	DebitCardPayment debitPayment;
	
	@Autowired
	UpiPayment upiPayment;
	
	
	public PaymentStrategy getPaymetFee(String type,double amount)
	{
		if(type.equalsIgnoreCase("crdeit"))
		{
			System.out.println("Credit Card Fee: "+creditPayment.calculateFee(amount));
			return creditPayment;
		}
		
		else if(type.equalsIgnoreCase("debit"))
		{
			System.out.println("Debit Card Fee: "+debitPayment.calculateFee(amount));
			return debitPayment;
		}
		System.out.println("UPI Fee: "+upiPayment.calculateFee(amount));
		return upiPayment;
		
	}
}

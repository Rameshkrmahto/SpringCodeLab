package com.nit.paymentTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.servicePayment.PaymentService;

public class PaymentTestMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentService pay1 = ctx.getBean(PaymentService.class);
		
		pay1.getPaymetFee("credit", 1000);
		ctx.close();
	}

}

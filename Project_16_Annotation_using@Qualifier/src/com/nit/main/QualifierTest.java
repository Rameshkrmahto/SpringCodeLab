package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfing;
import com.nit.service.PaymentProcessor;

public class QualifierTest {

	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfing.class);
		
		PaymentProcessor payProcesser = ctx.getBean("p",PaymentProcessor.class);
		
		payProcesser.Paymentmode();
		ctx.close();
	}

}

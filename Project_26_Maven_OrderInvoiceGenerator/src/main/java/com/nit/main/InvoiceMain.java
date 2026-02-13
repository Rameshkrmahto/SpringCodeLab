package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.InvoiceService;

public class InvoiceMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		InvoiceService invoice = ctx.getBean(InvoiceService.class);
		invoice.printInvoice();
		ctx.close();
		
		
	}
	

}

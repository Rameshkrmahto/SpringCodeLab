package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.support.TicketProcessor;

public class CustomerTicketMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		TicketProcessor ticket = ctx.getBean("tp",TicketProcessor.class);
		ticket.ticketInfo();
		ctx.close();
	} 

}

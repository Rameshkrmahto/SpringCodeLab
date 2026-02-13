package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.AppConfig.AppConfig1;
import com.nit.components.TicketBillCalculator;

public class DependencyTest_13_TicketBillCalculator {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig1.class);
		
		TicketBillCalculator ticketBill= ctx.getBean(TicketBillCalculator.class);
		System.out.println("Total Bill: "+ticketBill.calculateTotalAmount());
		ctx.close();
		

	}

}

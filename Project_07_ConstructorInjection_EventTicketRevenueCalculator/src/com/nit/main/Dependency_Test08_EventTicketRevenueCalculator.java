package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.EventTicketRevenueCalculator;

public class Dependency_Test08_EventTicketRevenueCalculator {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/config/applicationContext.xml");
		
		EventTicketRevenueCalculator eventTicketRevenueCalculator=(EventTicketRevenueCalculator)ctx.getBean("eventTicketRevenu");
		
		System.out.println("Total Revenue: "+eventTicketRevenueCalculator.calculateTotalRevenue());
		ctx.close();

	}

}

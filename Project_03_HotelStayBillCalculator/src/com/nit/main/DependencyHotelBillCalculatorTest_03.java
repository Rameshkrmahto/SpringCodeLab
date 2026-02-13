package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.HotelStayBillCalculator;

public class DependencyHotelBillCalculatorTest_03 {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");

		HotelStayBillCalculator hotelStayBillCalculator =(HotelStayBillCalculator)ctx.getBean("hsbill");	
		
		System.out.println("Total Bill: "+hotelStayBillCalculator.calculateStayBill());
		ctx.close();
	}

}

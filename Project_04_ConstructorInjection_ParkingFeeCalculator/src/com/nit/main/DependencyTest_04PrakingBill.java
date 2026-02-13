package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.ParkingFeeCalculator;

public class DependencyTest_04PrakingBill {
	
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/config/applicationContext.xml");
		
		ParkingFeeCalculator parkingBill= (ParkingFeeCalculator)ctx.getBean("pbill");
		
		System.out.println("Toltal Bill: "+parkingBill.calculateBill());
		
		ctx.close();
	}

}

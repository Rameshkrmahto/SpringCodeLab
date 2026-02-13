package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.ElectricityBillCalculator;

public class DependencyTest_14_ElectricityBillCalculationSystem {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ElectricityBillCalculator electricBill= ctx.getBean(ElectricityBillCalculator.class);
		
		System.out.println("Electricity Bill Amount = ₹"+electricBill.calculateBill());
		ctx.close();
	}
}

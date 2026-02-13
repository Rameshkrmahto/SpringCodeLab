package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.AppConfig.AppConfig;
import com.nit.Components.TravelPackageCostCalculator;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TravelPackageCostCalculator calculator = ctx.getBean(TravelPackageCostCalculator.class);
		
		double calculateFinalPackageCost = calculator.calculateFinalPackageCost();
		
		System.out.println(calculateFinalPackageCost);
		
		ctx.close();
	}
}

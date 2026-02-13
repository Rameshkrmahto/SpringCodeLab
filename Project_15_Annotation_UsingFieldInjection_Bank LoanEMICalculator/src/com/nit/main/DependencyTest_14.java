package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.EmiCalculator;

public class DependencyTest_14 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		EmiCalculator emi = ctx.getBean(EmiCalculator.class);
		
		System.out.println("Total Loan: "+emi.calculateEmi());
		ctx.close();
	}

}

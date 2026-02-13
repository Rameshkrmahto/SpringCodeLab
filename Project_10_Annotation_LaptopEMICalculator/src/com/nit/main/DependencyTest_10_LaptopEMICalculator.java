package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.appConfig.AppConfig;
import com.nit.sbeans.LaptopEMICalculator;

public class DependencyTest_10_LaptopEMICalculator {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		LaptopEMICalculator laptopEMI=ctx.getBean(LaptopEMICalculator.class);
		
		System.out.println("Total EMI: "+laptopEMI.calculateMonthlyEMI());
		ctx.close();
	}

}

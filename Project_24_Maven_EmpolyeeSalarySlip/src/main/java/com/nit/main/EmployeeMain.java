package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.SalarySlipService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		SalarySlipService salary = ctx.getBean("salary",SalarySlipService.class);
		salary.generateSlip();
		ctx.close();
		

	}

}

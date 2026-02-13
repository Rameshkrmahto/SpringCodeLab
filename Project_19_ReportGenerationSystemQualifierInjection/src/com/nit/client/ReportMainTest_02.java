package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.com.nit.generator.ReportManager;
import com.nit.config.AppConfig;

public class ReportMainTest_02 {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		ReportManager reportManger = ctx.getBean("rm",ReportManager.class);
		reportManger.reportDisplay();
		ctx.close();
	}

}

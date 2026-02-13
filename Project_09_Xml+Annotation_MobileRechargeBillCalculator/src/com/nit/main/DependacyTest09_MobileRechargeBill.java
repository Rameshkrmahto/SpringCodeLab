package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.AppConfig;
import com.nit.sbeans.MobileRechargeBillCalculator;

public class DependacyTest09_MobileRechargeBill {
	
	public static void main(String[] args) {
		
		//FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/config/applicationContext.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MobileRechargeBillCalculator bean = ctx.getBean(MobileRechargeBillCalculator.class);//mRechargeBill
		System.out.println("Total Bill: "+bean.generateReachargeBill());
	}

}

package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.InternetUsageBillCalculator;

public class Dependency_Test07InternetUsageBillCalculator {
	
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/config/applicationContext.xml");
				
		InternetUsageBillCalculator internetUsageBillCalculator =(InternetUsageBillCalculator)ctx.getBean("iuBill");
		
		System.out.println("Internate Bill: "+internetUsageBillCalculator.generateBill());
		ctx.close();
		
	}

}

package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.HospitalBillingSystem;

public class Dependency_Test_08_HospitalBillSystem {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/config/applicationCOntext.xml");
		
		HospitalBillingSystem hospitalBillingSystem=(HospitalBillingSystem)ctx.getBean("hbillsystem");
		
		System.out.println("Final Hospital Bill : "+hospitalBillingSystem.generateFinalBill());
		ctx.close();
	}

}

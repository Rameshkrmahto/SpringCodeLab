package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.ElectricityBillGenerator;

public class DependencyElectricBillGenaratorTest_02 {

	public static void main(String[] args) {
		
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
		
		Object obj =ctx.getBean("lb");
		
		ElectricityBillGenerator electricBill=(ElectricityBillGenerator)obj;
		
		System.out.println("Total Electricity Bill : "+electricBill.generateElectricBill());
		ctx.close();

	}

}

package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.DiscountCalculator;

public class DependencyDiscountCalculatorTest_01 {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
		
		Object obj=ctx.getBean("dc");
		
		DiscountCalculator discountCalculator=(DiscountCalculator)obj;
		
		System.out.println(discountCalculator.calculateDiscount());
		ctx.close();

	}

}

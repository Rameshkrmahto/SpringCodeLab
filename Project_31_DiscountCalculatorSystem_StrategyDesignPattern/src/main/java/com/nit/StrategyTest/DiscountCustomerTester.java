package com.nit.StrategyTest;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.biils.BillingService;
import com.nit.config.AppConfig;
import com.nit.sbeans.DiscountStrategy;

public class DiscountCustomerTester {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc=new Scanner(System.in);
		BillingService bill1 = ctx.getBean(BillingService.class);
		System.out.println("Enter the class bean id");
		
		DiscountStrategy ds = (DiscountStrategy)ctx.getBean(sc.next().toLowerCase());
		bill1.setDiscountStrategy(ds);
		
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		
		System.out.println(bill1.generateBill(amount));
		ctx.close();
		sc.close();
		
	}

}

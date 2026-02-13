package com.nit.BillsTester;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.BillSystem.ElectricityBillingSystem;
import com.nit.config.AppConfig;
import com.nit.sbeans.BillingStrategy;

public class ElectricityBillingTester {
    public static void main(String[] args) 
    {
        
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Scanner sc=new Scanner(System.in);
    	ElectricityBillingSystem electricBill =ctx.getBean(ElectricityBillingSystem.class);
    	
    	System.out.println("Enter Bill Type");
    	
    	BillingStrategy bs=(BillingStrategy) ctx.getBean(sc.next().toLowerCase());
    	
    	electricBill.setBillingStrategy(bs);
    	
    	System.out.println("Enter total units consumed:");
    	double units=sc.nextInt();
    	electricBill.showBill(units);
    	
    	ctx.close();
    	sc.close();
    	
    	
    	
    }
}

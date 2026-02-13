package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.AppConfig.AppConfigs;
import com.nit.components.RestaurantBillGenerator;

public class DependencyTest_11_RestaurantBillGenerate {
	
	public static void main(String[] args) {
		
		/*
		 * without using in Bean
		 * 
		 * // 1. Initialize Spring Container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigs.class);
        
        // 2. Get the Bean from the container
        RestaurantBillGenerator bill = ctx.getBean("rbg", RestaurantBillGenerator.class);
        
        // 3. Use Scanner to get data
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Food Amount: ");
        bill.setFoodAmount(sc.nextDouble());
        
        System.out.print("Enter Drink Amount: ");
        bill.setDrinkAmount(sc.nextDouble());
        
        System.out.print("Enter Service Charge: ");
        bill.setServiceCharge(sc.nextDouble());
        
        System.out.print("Enter GST %: ");
        bill.setGstPercentage(sc.nextDouble());
        
        // 4. Generate result
        System.out.println("\n--- Final Receipt ---");
        System.out.println("Total Bill: " + bill.generateFinalBill());
        
        sc.close();
        ctx.close();*/
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfigs.class);
		
		RestaurantBillGenerator bill=ctx.getBean(RestaurantBillGenerator.class);
		System.out.println("Total Bill: "+bill.gentrateFinalBill());
		ctx.close();
	}
	

}

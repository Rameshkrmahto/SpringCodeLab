package com.nit.AppConfig;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.nit.components.RestaurantBillGenerator;

@Configuration
@ComponentScan(basePackages="com.nit.components")
public class AppConfigs {
	
	Scanner sc=new Scanner(System.in);
/*
 * @Bean(name = "rbg")
    public RestaurantBillGenerator createBillGenerator() {
        Scanner sc = new Scanner(System.in);
        RestaurantBillGenerator generator = new RestaurantBillGenerator();

        System.out.println("--- Enter Details for Bean Initialization ---");
        
        System.out.print("Enter Food Amount: ");
        generator.setFoodAmount(sc.nextDouble());
        
        System.out.print("Enter Drink Amount: ");
        generator.setDrinkAmount(sc.nextDouble());
        
        System.out.print("Enter Service Charge: ");
        generator.setServiceCharge(sc.nextDouble());
        
        System.out.print("Enter GST Percentage: ");
        generator.setGstPercentage(sc.nextDouble());

        return generator; // This single instance is now managed by Spring
    }
}*/
	

    @Bean
    public RestaurantBillGenerator rbg() {
    	    System.out.println("Enter Food Amount");
    	    double foodAmount=sc.nextDouble();
    	    
    	    System.out.println("Enter Food  Drink Amount");
    	    double drinkAmount=sc.nextDouble();
    	    
    	    System.out.println("Enter Food Service Charge");
    	    double serviceCharge=sc.nextDouble();
    	    
    	    System.out.println("Enter GstPercentage");
    	    double gstPercentage=sc.nextDouble();
    	    
    	    RestaurantBillGenerator rs=new RestaurantBillGenerator();
    	    rs.setFoodAmount(foodAmount);
    	    rs.setDrinkAmount(drinkAmount);
    	    rs.setServiceCharge(serviceCharge);
    	    rs.setGstPercentage(gstPercentage);
    	    return rs;
	}
    
    
    


}

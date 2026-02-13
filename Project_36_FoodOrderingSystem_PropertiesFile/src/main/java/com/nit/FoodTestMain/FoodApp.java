package com.nit.FoodTestMain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.foodsbeans.FoodService;


public class FoodApp {
	
    public static void main(String[] args) {
    	
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        FoodService food1 = ctx.getBean(FoodService.class);
        food1.displayFoodInfo();
        ctx.close();
    }
}

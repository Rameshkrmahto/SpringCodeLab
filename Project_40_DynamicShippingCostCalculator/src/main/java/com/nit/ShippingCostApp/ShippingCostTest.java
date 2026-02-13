package com.nit.ShippingCostApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.ShippingService;

public class ShippingCostTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ShippingService service = ctx.getBean(ShippingService.class);
		
		double shippingCost = service.getShippingCost("sea", 5.0);
		System.out.println(shippingCost);
	}

}

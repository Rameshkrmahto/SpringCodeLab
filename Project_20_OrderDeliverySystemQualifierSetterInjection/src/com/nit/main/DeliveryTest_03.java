package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.delivery.OrderManager;

public class DeliveryTest_03 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		OrderManager order= ctx.getBean("order",OrderManager.class);
		order.orderDisplay();
		ctx.close();

	}

}

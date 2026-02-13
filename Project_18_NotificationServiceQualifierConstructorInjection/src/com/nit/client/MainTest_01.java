package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.processor.NotificationManager;

public class MainTest_01 {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		NotificationManager notification1 = ctx.getBean("service",NotificationManager.class);
		notification1.notifyUser();
		ctx.close();
	}
	
	

}

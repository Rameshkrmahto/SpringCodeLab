package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.componet.LaptopService;
import com.nit.config.AppConfig;

public class LaptopMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LaptopService laptop = ctx.getBean("lService",LaptopService.class);
		laptop.printLaptopDetails();
		ctx.close();
		
	}

}

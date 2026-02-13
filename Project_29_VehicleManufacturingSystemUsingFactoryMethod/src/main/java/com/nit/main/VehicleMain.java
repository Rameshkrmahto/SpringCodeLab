package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.engine_sbeans.VehicleService;

public class VehicleMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		VehicleService vehicleService=ctx.getBean(VehicleService.class);
		
		System.out.println(vehicleService.createVehicle("car","diseal"));
		ctx.close();
	}
	

}

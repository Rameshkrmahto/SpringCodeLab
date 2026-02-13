package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confing.AppConfig;
import com.nit.service.VehicleWorkshop;

public class QualifierTest_02 {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		VehicleWorkshop vehicle=ctx.getBean("vehicleworkshop",VehicleWorkshop.class);
		vehicle.displayService();
		ctx.close();
		
	}

}

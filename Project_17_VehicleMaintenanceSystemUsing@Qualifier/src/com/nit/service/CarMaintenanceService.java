package com.nit.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("carservice")
@Lazy(true)
public class CarMaintenanceService implements MaintenanceService{

	public CarMaintenanceService() {
		
		System.out.println("CarMaintenanceService: 0 param Constructor");
	}

	@Override
	public void performService() {
		
		
		System.out.println("CarMaintenanceService.performService()");
	}
	
	

}

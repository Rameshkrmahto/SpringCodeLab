package com.nit.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bikeservice")
@Lazy(true)
public class BikeMaintenanceService implements MaintenanceService{

	public BikeMaintenanceService() {
		
		System.out.println("BikeMaintenanceService: 0 param Constructor");
	}

	@Override
	public void performService() {
		
		System.out.println("BikeMaintenanceService.performService()");
		
	}

}

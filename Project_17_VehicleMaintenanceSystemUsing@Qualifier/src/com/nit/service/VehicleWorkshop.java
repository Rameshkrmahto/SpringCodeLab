package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicleworkshop")
public class VehicleWorkshop {
	
	@Autowired
	@Qualifier("carservice")
	MaintenanceService maintenanceService;
	
	
	public void displayService()
	{
		maintenanceService.performService();
	}
	
	
	
	
	

}

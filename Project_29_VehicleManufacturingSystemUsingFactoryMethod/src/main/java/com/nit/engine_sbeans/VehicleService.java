package com.nit.engine_sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.VehicleFactory.VehicleFactory;
import com.nit.vehicle_sbeans.Vehicle;
@Component
public class VehicleService {
     @Autowired
	VehicleFactory vechilef;
     
     public String createVehicle(String type, String engineType){
    	      Vehicle vehicle = vechilef.createVehicle(type, engineType);
    	      
    	    return vehicle.getDescription();
     }
	
	
}

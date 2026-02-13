package com.nit.VehicleFactory;

import com.nit.vehicle_sbeans.Vehicle;

public interface VehicleFactory {
	
	
	
	public Vehicle createVehicle(String type,String engineType);
	

}

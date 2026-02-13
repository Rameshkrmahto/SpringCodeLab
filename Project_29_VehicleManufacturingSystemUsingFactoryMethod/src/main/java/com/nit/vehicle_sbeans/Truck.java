package com.nit.vehicle_sbeans;

import com.nit.engine_sbeans.Engine;

public class Truck implements Vehicle{

	Engine engineType;
	
	double payLoadCapacity;
	
	
	
	public Truck(Engine engineType, double payLoadCapacity) {
		super();
		this.engineType = engineType;
		this.payLoadCapacity = payLoadCapacity;
	}



	@Override
	public String getDescription() {
		
		return "Truck Engine type: "+engineType+"PayLoad Capacity: "+payLoadCapacity;
	}

}

package com.nit.vehicle_sbeans;

import com.nit.engine_sbeans.Engine;

public class Car implements Vehicle{

	Engine engineType;
	int noOfDoor;
	
	
	
	public Car(Engine   engineType, int noOfDoor) {
		super();
		this.engineType = engineType;
		this.noOfDoor = noOfDoor;
	}



	@Override
	public String getDescription() {
		
		return "Car Engine Type: "+engineType+" number of door:"+noOfDoor;
	}

}

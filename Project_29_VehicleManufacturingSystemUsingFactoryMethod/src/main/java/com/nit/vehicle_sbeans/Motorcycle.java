package com.nit.vehicle_sbeans;

import com.nit.engine_sbeans.Engine;

public class Motorcycle implements Vehicle{

	Engine engineType;
	String sidecar;
	
	public Motorcycle(Engine engineType, String sidecar) {
		super();
		this.engineType = engineType;
		this.sidecar = sidecar;
	}

	@Override
	public String getDescription() {
		
		return "Car Engine Type: "+engineType+" it has sidecar";
	}

}

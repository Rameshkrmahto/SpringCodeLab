package com.nit.VehicleFactory;

import org.springframework.stereotype.Component;

import com.nit.engine_sbeans.Diesel;
import com.nit.engine_sbeans.Electric;
import com.nit.engine_sbeans.Engine;
import com.nit.vehicle_sbeans.Car;
import com.nit.vehicle_sbeans.Motorcycle;
import com.nit.vehicle_sbeans.Truck;
import com.nit.vehicle_sbeans.Vehicle;

@Component
public class ConcreteVehicleFactory implements VehicleFactory{

	
	@Override
	public Vehicle createVehicle(String type, String engineType) {
	  Engine e=null;
	    if(engineType.equals("petrol")) {
	    	e=new Electric();
	    }
	    else if(engineType.equals("diseal")) {
	    	e=new Diesel();
	    }
	    else {
	   System.out.println("other type");
	    }
	  
	  
		if(type.equalsIgnoreCase("car"))
		{
		return  new Car(e,1200);
		}
	else if(type.equalsIgnoreCase("truck"))
			return  new Truck(e,12000);
		
	else if(type.equalsIgnoreCase("motorcycle"))
		
		return new Motorcycle(e,"sidecar");
		
		return  null;
		
		
	}

}

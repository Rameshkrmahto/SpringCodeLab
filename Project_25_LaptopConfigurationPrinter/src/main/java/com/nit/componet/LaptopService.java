package com.nit.componet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lService")
public class LaptopService {
	
	
	
	public LaptopService() {
		System.out.println("LaptopService: 0 param Constructor");
	}

	@Autowired
	Laptop laptop;
	
	public void printLaptopDetails()
	{
		System.out.println("Laptop Brand: "+laptop.brand);
		System.out.println("Processor: "+laptop.processor);
		System.out.println("Ram: "+laptop.ram);
		
	}

}

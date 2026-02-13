package com.nit.service;

import org.springframework.stereotype.Component;

@Component("delhivery")
public class DelhiveryService implements DeliveryService{

	@Override
	public void deliverOrder() 
	{
		System.out.println("DelhiveryService.deliverOrder()");
		
	}


	

}

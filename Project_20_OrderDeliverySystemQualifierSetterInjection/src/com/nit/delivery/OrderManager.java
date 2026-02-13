package com.nit.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.service.DeliveryService;

@Component("order")
public class OrderManager {
	
	DeliveryService deliveryService;

	
	
	@Autowired
	@Qualifier("blueDart")
	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	public void orderDisplay()
	{
		deliveryService.deliverOrder();
	}
	
	
	

}

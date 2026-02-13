package com.nit.service;


import java.util.Map;


import org.springframework.stereotype.Component;


import com.nit.StrategyInterface.ShippingStrategy;

@Component
public class ShippingService {
	
	
	Map<String,ShippingStrategy> shippingStrategy1;
	
	 

	 public ShippingService(Map<String,ShippingStrategy> shippingStrategy1) {
		
		this.shippingStrategy1 = shippingStrategy1;
		
		
	 }
	 
	 public double getShippingCost(String type,double weight)
	 { 
		 ShippingStrategy shippingStrategy = shippingStrategy1.get(type);
		 
			return shippingStrategy.calculateCost(weight);
		 
	 }
}

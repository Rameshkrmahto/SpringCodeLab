package com.nit.foodsbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FoodService {
	
	@Autowired
	private FoodDetails foodDetails;
	
	public void displayFoodInfo()
	{
		System.out.println("Food Id: "+foodDetails.getFoodId());
		System.out.println("Food Name: "+foodDetails.getFoodName());
		System.out.println("Preparation Time: "+foodDetails.getPreparationTime());
		System.out.println("Restaurant Name: "+foodDetails.getRestaurantName());
	}

}

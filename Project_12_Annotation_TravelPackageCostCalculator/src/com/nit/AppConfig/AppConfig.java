package com.nit.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.Components.PackageDetails;

@ComponentScan("com.nit.Components")
@Configuration
public class AppConfig {
	
	@Bean
	public PackageDetails details() {
		PackageDetails packageDetails=new PackageDetails();
		packageDetails.discountPercentage=10;
		packageDetails.numberOfTravelers=20;
		packageDetails.packageCostPerPerson=10;
		return packageDetails;
	}
	

}

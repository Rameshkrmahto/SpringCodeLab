package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.componet.Laptop;

@ComponentScan(basePackages="com.nit")
@Configuration
public class AppConfig {
	
	
	
	public AppConfig() {
		System.out.println("AppConfig: 0 param Constructor");
	}

	@Bean("laptop")
	public Laptop getDetials()
	{
		return new Laptop("HP","intel i7","16GB");
	}
	

}

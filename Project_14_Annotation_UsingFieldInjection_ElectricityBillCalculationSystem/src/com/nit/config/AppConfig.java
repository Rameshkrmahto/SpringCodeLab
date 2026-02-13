package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.MeterReading;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	
	

	public AppConfig() {
		System.out.println("AppConfig:0_param_Contructor");
	}

	@Bean
	public MeterReading display()
	{
		return new MeterReading(350,6);
	}
	
	

}

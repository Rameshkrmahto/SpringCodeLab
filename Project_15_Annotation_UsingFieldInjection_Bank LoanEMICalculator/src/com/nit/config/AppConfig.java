package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.LoanDetails;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	
	@Bean
	public LoanDetails display()
	{
		return new LoanDetails(500000,10,60);
	}

}

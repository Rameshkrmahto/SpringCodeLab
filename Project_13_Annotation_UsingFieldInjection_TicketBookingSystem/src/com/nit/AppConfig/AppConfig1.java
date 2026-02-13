package com.nit.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.components.TicketDetails;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig1 {
	
	
	@Bean 
	public TicketDetails display()
	{
		return new TicketDetails(200,3,10);
		
		
	}

}

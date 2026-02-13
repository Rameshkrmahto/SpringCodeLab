package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Employee;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	@Bean
	public Employee getDisplay()
	{
		return new Employee(1001,"John",50000,4500,5000,10);
	}
	

}

package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/nit/propertiesFile/food.properties")
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	

}

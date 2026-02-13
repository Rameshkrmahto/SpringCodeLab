package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit")
@PropertySource("com/nit/propertiesFile/shipping.properties")
public class AppConfig {
	
	

}

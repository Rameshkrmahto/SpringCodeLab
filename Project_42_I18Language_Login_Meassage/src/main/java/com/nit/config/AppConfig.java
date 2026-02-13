package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan("com.nit")
public class AppConfig {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource getLanguage()
	{
		ResourceBundleMessageSource msg=new ResourceBundleMessageSource();
		msg.setBasename("com/nit/commans/messages");
		
		return msg;
		
	}

}

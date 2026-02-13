package com.nit.sbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {

	@Bean
	public MobileRechargeBillCalculator billCalculator() {
		return new MobileRechargeBillCalculator(200, 10, 10);
	}

}

package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.CommercialBilling;
import com.nit.sbeans.IndustrialBilling;
import com.nit.sbeans.ResidentialBilling;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {

	
	@Bean(name="commercial")
	public CommercialBilling getCommercialBilling()
	{
		return new CommercialBilling();
	}
	
	@Bean(name="industrial")
	public IndustrialBilling getIndustrialBilling()
	{
		return new IndustrialBilling();
	}
	
	@Bean(name="residential")
	public ResidentialBilling getResidentialBilling()
	{
		return new ResidentialBilling();
	}
}

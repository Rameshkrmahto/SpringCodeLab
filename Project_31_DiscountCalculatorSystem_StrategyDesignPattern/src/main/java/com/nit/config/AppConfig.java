package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.EliteCustomerDiscount;
import com.nit.sbeans.PremiumCustomerDiscount;
import com.nit.sbeans.RegularCustomerDiscount;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	
	@Bean(name="regular")
	public RegularCustomerDiscount regualr()
	{
		return new RegularCustomerDiscount();
	}
	
	@Bean(name="premium")
	public PremiumCustomerDiscount premiumCustomer()
	{
		return new PremiumCustomerDiscount();
	}
	
	@Bean(name="elite")
	public EliteCustomerDiscount EliteCustomer()
	{
		return new EliteCustomerDiscount();
	}
	

}

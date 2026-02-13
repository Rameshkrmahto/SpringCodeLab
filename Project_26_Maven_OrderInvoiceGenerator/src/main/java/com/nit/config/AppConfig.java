package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Product;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
	
	@Bean
	public Product getProduct()
	{
		Product product=new Product();
		product.setName("Laptop");
		product.setPrice(500000);
		product.setQuantity(2);
		return product;
	}
	

}

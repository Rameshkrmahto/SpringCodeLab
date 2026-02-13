package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit")
@PropertySource(value = "com/nit/paymentproperties/payment.properties")
public class AppConfig {

}

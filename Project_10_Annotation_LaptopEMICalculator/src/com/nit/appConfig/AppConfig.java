package com.nit.appConfig;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.LaptopEMICalculator;

//@Component("lpemi")
@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
	
	@Bean
	public LaptopEMICalculator laptopEMI()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter laptop Amount");
		double laptopAmount=sc.nextDouble();
		System.out.println("Enter  Dowan Payment Amount");
		double dowanPay=sc.nextDouble();
		System.out.println("Enter Month");
		int month=sc.nextInt();
		
		return new LaptopEMICalculator(laptopAmount,dowanPay,month);
	}

}

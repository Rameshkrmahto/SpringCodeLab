package com.nit.BankTester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.customer.AppConfing;
import com.nit.customer.CustomerClass;

public class BankTester {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfing.class);
		
		CustomerClass c1 = ctx.getBean(CustomerClass.class);
		c1.setBank("sbi");
		c1.setCustomerName("Rakesh");
		c1.setCutomerId(1231);
		c1.deposit(1200);
		//c1.display();
		
		
	c1.withdraw(10200);
//		c1.display();
		ctx.close();
		
	}

}

package com.nit.FlightMainTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.flightsbeans.User;

/**
 * Hello world!
 */
public class FlightBookingApp {
	
    public static void main(String[] args) {
    	
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        User user1 = ctx.getBean(User.class);
        
        System.out.println(user1);
        ctx.close();
    }
}

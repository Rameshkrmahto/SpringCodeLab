package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.auth.LoginManager;
import com.nit.config.AppConfig;

public class LoginMainTest_04 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LoginManager loginManager= ctx.getBean("lm",LoginManager.class);
		loginManager.loginDetails(); 
		ctx.close();
		
	}

}

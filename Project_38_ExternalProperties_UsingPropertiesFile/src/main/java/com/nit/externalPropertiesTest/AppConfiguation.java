package com.nit.externalPropertiesTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.config.AppConfigurationInjectionClass;

/**
 * Hello world!
 */
public class AppConfiguation {
	
    public static void main(String[] args) {
    	
        AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfigurationInjectionClass app1 = ctx.getBean(AppConfigurationInjectionClass.class);
        app1.printAppDeatils();
    }
}

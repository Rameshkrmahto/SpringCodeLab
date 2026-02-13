package com.nit.I18Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.LanguageAccept;

public class I18MainTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		LanguageAccept i18 = ctx.getBean(LanguageAccept.class);
		
		i18.greetingMeassage("en");
		
		ctx.close();
	}

}

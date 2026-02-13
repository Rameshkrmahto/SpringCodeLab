package com.nit.I18Main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.LanguageAccept;

public class I18MainTestLoginLanguage {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		LanguageAccept i18 = ctx.getBean(LanguageAccept.class);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your Username");
		
		String user=sc.nextLine();
		
        System.out.println("Enter your Password");
		
		String pwd=sc.nextLine();
		
        System.out.println("Enter your Language Code");
		
		String code=sc.nextLine();
		
		i18.greetingMeassage(user, pwd, code);
		sc.close();
		ctx.close();
	}

}

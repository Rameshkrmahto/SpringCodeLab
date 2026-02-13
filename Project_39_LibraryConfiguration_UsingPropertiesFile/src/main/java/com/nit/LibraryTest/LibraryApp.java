package com.nit.LibraryTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.component.Library;
import com.nit.config.AppConfig;

public class LibraryApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Library l1 = ctx.getBean(Library.class);
		l1.displayLibraryInfo();
		ctx.close();
		
	}

}

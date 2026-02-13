package com.nit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nit.sbeans.DatePrinter;

public class DependencyDatePrintTest1 {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com\\cfgs\\applicationContext.xml");
		
		Object obj=ctx.getBean("pDate");
		
		DatePrinter d1=  (DatePrinter)obj;
		
		d1.getDate();
		
		

	}

}

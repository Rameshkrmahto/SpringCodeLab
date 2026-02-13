package com.nit.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class LanguageAccept {
	
	@Autowired
	ResourceBundleMessageSource language;
	
	public void greetingMeassage(String username,String pwd,String code)
	{ 
		
		Locale locale=null;
		
		
		
		if(username.equalsIgnoreCase("raj") && pwd.equalsIgnoreCase("1234"))
		{
			String message1 = language.getMessage("message1", null, locale);
			if(code.equals("en")) {
				locale=new Locale(code);
				
			}
			
			else if(code.equals("hi"))
			{
				locale=new Locale(code);
			}
				
			else if(code.equals("te"))
			{
				locale=new Locale(code);
			}
			System.out.println(" "+message1);
		}
	
		else
		{
			if(code.equals("en")) {
				locale=new Locale(code);
				
			}
			
			else if(code.equals("hi"))
			{
				locale=new Locale(code);
			}
				
			else if(code.equals("te"))
			{
				locale=new Locale(code);
			}
			String message2 = language.getMessage("message2", null, locale);
			System.out.println(" "+message2);
		}
		
		
		
	}
	
	

}

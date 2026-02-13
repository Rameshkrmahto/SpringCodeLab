package com.nit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfigurationInjectionClass {
	
	@Value("${app.name}")
	private String name;
	
	@Value("${app.version}")
	private String version;
	
	@Value("${app.description}")
	private String description;
	
	@Value("${app.author}")
	private String author;
	
	@Value("${app.contactEmail}")
	private String email;
	
	@Value("${app.maxUsers}")
	private int maxUsers;
	
	public void printAppDeatils()
	{
		System.out.println("Name: "+name);
		System.out.println("Version: "+version);
		System.out.println("Description: "+description);
		System.out.println("Author: "+author);
		System.out.println("Contact Eamil: "+email);
		System.out.println("Max Users: "+maxUsers);
	}

}

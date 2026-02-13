package com.nit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {
	
	@Value("${library.name}")
	private String name;
	
	@Value("${library.location}")
	private String loaction;
	
	@Value("${library.maxBooks}")
	private int maxBooks;
	
	@Value("${library.openingHours}")
	private String openingHours;
	
	@Value("${library.closedOn}")
	private String closing;
	
	@Value("${library.contactEmail}")
	private String email;
	
	
	public void displayLibraryInfo()
	{
		System.out.println("Name of Library: "+name);
		System.out.println("Library Location: "+loaction);
		System.out.println("Max Book in Library: "+maxBooks);
		System.out.println("Opining Hours of Library: "+closing);
		System.out.println("Closing  Hours of Library: "+openingHours);
		System.out.println("Library Email: "+email);

	}
	

}

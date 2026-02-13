package com.nit.service;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationService implements NotificationService{

	
	
	public EmailNotificationService() {
		System.out.println("EmailNotificationService:0 param Constructor");
	}

	@Override
	public void sendNotification() {
		
		System.out.println("Notification From Email");
		
	}
	


}

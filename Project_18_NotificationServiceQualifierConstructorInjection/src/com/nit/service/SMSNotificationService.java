package com.nit.service;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotificationService  implements NotificationService{
	
	

	public SMSNotificationService() {
		
		System.out.println("SMSNotificationService:0 param constructor");
	}

	@Override
	public void sendNotification() {
		
		System.out.println("Notification From SMS");
		
	}
	


}

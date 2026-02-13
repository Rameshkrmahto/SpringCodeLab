package com.nit.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.service.NotificationService;

@Component("service")
public class NotificationManager {
	
	NotificationService notificationService;
	
	

	
	public NotificationManager() {
		System.out.println("NotificationManager: 0 param Constructor");
	}

	@Autowired
	public NotificationManager(@Qualifier("sms") NotificationService notificationService) {
		
		this.notificationService = notificationService;
	}
	
	public void notifyUser()
	{
		notificationService.sendNotification();
	}
	
	

}

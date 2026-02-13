package com.nit.service;


import org.springframework.stereotype.Component;

import com.nit.sbeans.NotificationStrategy;

@Component
public class NotificationService {
	
	
	NotificationStrategy notificationStrategy;

	public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}
	
	public void notifyUser(String message)
	{
		notificationStrategy.send(message);
	}
	

}
